package by.it.akhmelev.calc.v2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {
    Var calc(String cmd) throws CalcException{
        //2+2    -2*2       2.0-2.22          -3/4.9
        //{2,7,8,6}+2    -2*2       2.0-2.22          -3/4.9
        String[] strVars = cmd.split(Patterns.OPERATION);
        if (strVars.length==1)
            return Var.createVar(cmd);
        Var two=Var.createVar(strVars[1]);
        if (cmd.contains("=")){
            Var.saveVar(strVars[0],two);
            return two;
        }
        Var one=Var.createVar(strVars[0]);
        if (one==null || two==null){
            //todo Create error unknow operation
            System.out.println("Переменная не распозана");
            return null;}
        Pattern patternOperation = Pattern.compile(Patterns.OPERATION);
        Matcher matcher = patternOperation.matcher(cmd);
        if (matcher.find()){
            String operation = matcher.group();
            switch (operation) {
                case "+": return one.add(two);
                case "-": return one.sub(two);
                case "*": return one.mul(two);
                case "/": return one.div(two);
            }
        }
        //todo Create error unknow operation
        System.out.println("Операция не распозана");
        return null;
    }
}