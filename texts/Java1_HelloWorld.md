# Java 简介

## Java三大版本

基本特性：write once, run anywhere.（跨平台特性），因为有JVM。

- JavaSE：标准版（桌面程序，控制台开发），Java最核心最基本的部分。
- JavaME：嵌入式开发（手机，小家电），几乎没人学，几乎已经死掉了。
- JavaEE：企业级开发（web端，服务器开发），Java最热门的领域，但Java的基础是JavaEE。

## JDK，JRE，JVM

- JDK：Java Development Kit
- JRE：Java Runtime Enviroment
- JVM：Java Virtual Machine （可以用软件或者硬件来实现）

![Introduction_JDK](C:\Users\Asus\Desktop\notes\figures\Introduction_JDK.png)

## 安装IDE

一般使用JDK8，JDK11，JDK12之流无非是加入了一些新特性，最主要的还是JDK8，企业中用的最多的也是JDK8。

Java现在被Oracle公司管理。详情可以见狂神的视频

- jdk的bin目录存放的是编译器如javac等可执行文件
- jdk的include目录存放的是bin中可执行文件的一些头文件（毕竟可执行文件以前使用C写的）
- jdk的src.zip文件里放了很多java原生的类，比如math，lang等。

## 第一个HelloWorld程序

- 可以使用cmd直接进入当前目录的命令行界面

![Introduction_cmd](C:\Users\Asus\Desktop\notes\figures\Introduction_cmd.png)

- java程序里最好不能有中文注释
- 以下是Helloworld.java程序所对应的运行图
- ![image-20210702225205448](C:\Users\Asus\AppData\Roaming\Typora\typora-user-images\image-20210702225205448.png)

## Java程序的运行机制

编译型和解释型的结合，现在随着硬件能力的提升，解释的时候也变快了。

![image-20210703102544897](C:\Users\Asus\AppData\Roaming\Typora\typora-user-images\image-20210703102544897.png)

字节码校验器检查代码有没有写错

## IDEA的安装

详情可见狂神的视频
