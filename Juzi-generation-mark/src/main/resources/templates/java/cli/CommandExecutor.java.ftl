package ${basePackage}.cli;

import ${basePackage}.cli.command.GenerateCommand;
import ${basePackage}.cli.command.ListCommand;
import ${basePackage}.cli.command.ConfigCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;
/**
* 命令执行器
*/
@Command(name = "${name}",mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable{
    private final CommandLine commandLine;

    {
        commandLine = new CommandLine(this)
            .addSubcommand(new GenerateCommand())
            .addSubcommand(new ListCommand())
            .addSubcommand(new ConfigCommand());
    }

    @Override
    public void run(){
          System.out.println("请输入具体命令，或者输入 --help 查看命令提示");
    }

    /**
    * 执行命令
    *
    * @param args
    * @return
    */
    public Integer doExecute(String[] args) {
        return commandLine.execute(args);
    }
}
