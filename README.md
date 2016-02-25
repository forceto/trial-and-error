# <center>trial-and-error</center>
>this is a self-practice repository.


##<center>eclipse 快捷键</center>

1.代码右移				选定后，tab

2.代码左移				选定后，shift+tab

3.自动对其格式				ctrl+shift+f

4.打开资源				Ctrl+shift+r

5.切换已代开的编辑窗口		ctrl+e

6.多行注释				选定后，ctrl+shift+/    

7.取消多行注释				光标落在注释范围内，ctrl+shift+\

8.找具体的类				ctrl+shift+t

9.抽取方法				ctrl+shift+m

10.重命名(类名、变量名)		alt+shift+r

11.自动生成代码			alt+shift+s

12.整理包（导包）			ctrl+shift+o



##<center>插入的不同语法</center>
*Set & List --->add*

*Queue  ---> offer*

*Map ---> put*

##<center>性能分析</center>
###Set
|EnumSet|HashSet|LinkedHashSet|TreeSet|
|-------|:------:|:----------:|:-----:|
|性能最好|最常用，增、删|遍历最快        |排序|
###List

|ArrayList|ArrayDequeue|LinkedList|
|----------|:-----------:|:-------:|
|最常用、随机访问|随机访问	|插入、删除|

###Map

|EnumMap   > |HashMap   > |LinkedHashMap  > |TreeMap|
|------------|:------------:|:-----------------:|-------:|
|EnumMap性能最好|HashMap最常用|LinkedHashMap迭代性能最好|TreeMap用于查找|

##<center>泛型方法vs泛型通配符</center>
**泛型通配符：**
<ol>
	<li>最常用</li>
	<li>用来支持灵活的子类化</li>
</ol>

**泛型方法：**
<ol>
	<li>允许类型形参被用来表示方法的一个或多个参数之间的类型依赖关系</li>
	<li>方法返回值与参数之间的类型依赖关系</li>
	
</ol>
