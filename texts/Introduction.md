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

