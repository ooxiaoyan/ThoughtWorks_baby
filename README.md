# ThoughtWorks_baby

## ThoughtWorks_2017_12_23
思沃大讲堂 第一次作业

- Warm up Welcome
- Culture
- Agile Methodology
- Presentation Tips
- Feedback
- Review
- Retro
- 总结

## ThoughtWorks_2018_01_06
思沃大讲堂 第二次作业

- html（纯html实现考试界面）
- html+css（ html+css实现考试界面）

## ThoughtWorks_2018_01_13
斯沃大讲堂 第三次作业

- GuessNumbers

开发一个简单的猜数字游戏，基本业务逻辑如下：

游戏开始后，系统会随机给出一个四位，每位都不重复的数字作为答案。由用户输入自己猜测的 四个数字。 系统会将两个数字进行对比，并给形出xAxB的提示， 比如”2A1B”。 如果数字猜对而且位置也对，就是一个A。 如果数字猜对但位置不对，就是一个B。 例如：

系统给出”1234”，用户输入”1234” 返回”4A0B” 系统给出”1234”，用户输入”4321” 返回”0A4B”

第一问 xAxB
写一个CompareNumber类，只有一个函数，该函数接受两个参数，一个是答案，一个是用户输入的四位数。返回值是xAxB的字符串 这里我们假定答案和用户输入都是合法的四位数。不用考虑数字合法性问题。 请对这个类写测试（思考要写几个测试）

第二问 随机数生成
写一个AnswerGenerator类，只有一个函数，返回一个四位，每位都不重复随机数。 请对这个类写测试。（思考测试哪些）

第三问
写一个Guess类，还是只有一个函数，但是只有一个参数。把前两问做的类集成起来，写一个集成的单元测试，写一个集成测试。

第四问
完成整个游戏。整个游戏是以命令行方式进行的。每回游戏有六次机会。每输入一次数字就会减少一次机会并打印xAxB。

当游戏开始时，打印“Welcome!”空一行打印 “Please input your number(6): “ 每次输入完并敲击回车，就会在下面打印出xAxB，然后空一行打印出新的”Please input your number(x): “ 当输入的数字包含重复数字并回车时，在下面打印”Cannot input duplicate numbers!” 当6次都没有猜中的时候，打印”Game Over”并退出 当猜中的时候，不要打印4A0B,而是打印”Congratulations!”并退出
