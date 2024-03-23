package ${basePackage};
import ${basePackage}.cli.CommandExecutor;

public class Main{
    public static void main(String[] args){
        CommandExecutor commondExecutor = new CommandExecutor();
        commondExecutor.doExecute(args);
    }
}