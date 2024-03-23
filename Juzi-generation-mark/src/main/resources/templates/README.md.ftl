# ${name}

> ${description}
>
> 作者：${author}
>
> 基于 [程序员橘子皮](https://github.com/HuangGreatd) 的 [橘子代码生成器项目](https://github.com/HuangGreatd/Juzi-code-generate) 制作，感谢您的使用！

可以通过命令行交互式输入的方式动态生成想要的项目代码

## 使用说明

执行项目根目录下的脚本文件：

```
generator <命令> <选项参数>
        ```

        示例命令：

        ```
        generator generate <#list modelConfig.models as modelInfo>-${modelInfo.abbr} </#list>
        ```

        ## 参数说明

        <#list modelConfig.models as modelInfo>
        ${modelInfo?index + 1}）${modelInfo.fieldName}

        类型：${modelInfo.type}

        描述：${modelInfo.description}

        默认值：${modelInfo.defaultValue?c}

        缩写： -${modelInfo.abbr}


</#list>
```
在使用和学习了这个项目后，如果你觉得有帮助或者喜欢，欢迎给这个项目打一个Star！你的支持将鼓励我继续改进并创建更多的开源项目。感谢你的支持！
也欢迎你将这个项目分享给你的朋友和同事，一起来学习交流，共同提高我们的编程技能！如果你有任何问题或者建议，也可以在GitHub Issues中提出，我会尽快回复并处理。
再次感谢你的使用和支持！
