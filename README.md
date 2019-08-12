# <center>trial-and-error</center>
>this is a self-practice repository.

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
