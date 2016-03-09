**JRE=JVM+类库**

**JDK=JRE+Java开发工具**

**配置环境变量后，能够在任何目录下使用javac命令**
##书写规范
1. 左大括号前有空格
2. 方法和程序块之间加空行隔开
3. 并排语句之间加空格，例如for语句
4. 运算符两侧加空格


**java关键字全是小写**

##命名规则
**包名命名**

1. 全部小写
2. 域名倒着写

**类、几口命名**

1. 每个单词首字母大写（驼峰命名）

**方法**

1. 第一个单词首字母小写，后面单词的首字母大写

**常量**

1. 一个单词，所有字母大写
2. 多个单词，所有单词的字母大写，单词之间加_

##进制

* 二进制
	* 以0b或0B 开头
* 八进制
	* 以0开头
* 十六进制
	* 0x开头 

**10进制转X进制**
*每个系数乘基数的权次幂再相加*


**X进制转10进制**
*除积倒着去余数*

##原反补
* 原码
	* 最高位是符号位，0正1负，其余位数表示数字大小
* 反码
	* 正数原反补相同；负数的反码是，对其除了符号位外，逐位取反
* 补码
	* 正数的原反补相同；负数的补码实将其反码的末位加1
##常量

1. 字符串
2. 字符
3. 整数
4. 小数
5. 布尔
6. null
##变量
* 局部变量在使用之前必须赋值

* 数据类型转换
	* 隐式转换————当大的数据类型和小的数据类型在一起运算时，小的数据类型会自动提升为大的数据类  型
	* 强制类型转换————如果超出被赋值的数据类型的取值范围，则得到的结果会与期望的结果不同。向下                  强制类型转换会损失精度。


* byte与byte（或short，char）进行运算时会提升为int
* 在编译时，无法判断变量的值，有可能超出byte的范围 （如下例）

	byte b1 = 3;
	byte b2 = 4;
	byte b3 = b1 + b2;   （报错）
	
**进行混合运算时，byte、short、char不会相互转换，而是自动类型转换为int型，其他类型进行混合预算时，是小的数据类型提升为大的数据类型**

|**      |**       |**		|**		|**		   |**	  |**   	|**    | **   |
|--------|:------:|:-----:|:----:|:-------:|:-----:|:------:|:-----:|:----:|
|byte	|           |       |		|		  |		  |   	   |  		|	  |
|short  |---------->|int	|------>|long	|------->|float		|----->|double|      
|char   |			|		|		 |		|		 |			|   	|		|
	

**float的取值范围大于long**

**任何数据类型直接用 + 与字符串相连都会产生新的字符串**

		System.out.println("hello"+'a'+1);    
		生成字符串  helloa1

		System.out.println('a'+1+"hello");
		从左往右运算，'a' + 1 =98,然后，98 + “hello” 
		生成字符串  98hello

**byte 范围：-128~127**
**char 范围：0~65535**
**char 可以存储中文**
>     原因：java使用Unicode编码。
>     	   在Unicode编码中，每个字节占2byte。
>	  	   而中文的一个汉字在内存中也占2byte，故可以。	

##运算符

**整数和整数相除只能得到整数。若想得到小数，把其中一个数变成小数，另一个数在运算时会自动类型提升**

* 取余 % 
	* 当左边的绝对值小于右边的绝对值时，结果为左边本身
	* 当左边的绝对值等于右边或是右边的的倍数时，结果是0
	* 当左边的绝对值大于右边的绝对值时，结果是余数
	* % 运算符结果的符号和左边的数的符号保持一致，与右边数无关
	* 任何一个正整数 % 2 后，结果不是 0 就是 1 ，（可用来最为切换条件）

* 自增自减   ++
	* 当++在变量后面时，会现将变量中的值取出，做赋值操作，然后在自身+ 1 
		b = a++;
	* 当++ 在变量前面时，会先自身+1，然后再将+1后的结果赋值
		b = ++ a ;
* +=


			void test(){
				short s = 1;
				s +=1;   //底层进行  s = (short)(s + 1);
			----------------------------------
				short s = 1;
				//等号右边的1位int型
			    //short与int相加时，short会自动提升为int
				//int赋值给short会损失精度，即报错
				s = s + 1;

			}

* &&和& 的区别
	* &&具有短路效果，左边是false，右边就不执行
* || 与 | 的区别
	* || 具有短路效果，左边为true，右边不执行
* 位运算符
	* 按位与 &
	* 按位或 |
	* 按位异或 ^
		* 一个整数对另一个整数异或2次，该数本身不变(用于交换两个整数)
	* 按位取反 ~
	* 移动（左乘右除）
		* 左移————向左移动几位就是乘以2的几次方
			* 左边最高位丢弃，右边补0
		* 右移————向右移动几位就是除以2的几次方
			* 有符号右移	>>
				* 最高位是0，左边补0；最高位是1，左边补1
			* 无符号右移	>>>
				* 左边只补0
* 键盘输入  Scanner

<hr/>

							System.out.println(6 & 3 );
							/*
								6	110
								3	011
	    						&			按位与
	    						---------
									010     等于2
							*/
					
							System.out.println( 6 | 3);
							/*
								6	110
								3	011
								|			按位或
								---------
							        111     等于7
							*/
							System.out.println(6 ^ 3);
							/*
								6	110
								3	011
	
								^			按位异或
								---------
								    101     等于5
							*/
	
			
		System.out.println(~6);			//取反	~  	//包括符号位在内，逐位取反
		/*
		6为正数，原反补相同
		在运算时，使用的是补码
			6	00000000 00000000 00000000 00000110		然后逐位取反
	
			    11111111 11111111 11111111 11111001		此为补码，再算反码
	  		  - 00000000 00000000 00000000 00000001
	        ----------------------------------------
				11111111 11111111 11111111 11111000		得到反码，除符号位外，逐位取反
				10000000 00000000 00000000 00000111		得到原码，即为 -7
	
		*/
		/*
			通过按位异或交换两个整数
			x = x ^ y;		//x = 10 ^ 5
			y = x ^ y;		//y = 10 ^ 5 ^ 5 = 10
			x = x ^ y;		//x = 10 ^ 5 ^ 10 = 5
		*/
		/*	
				System.out.println(12 << 1);
				System.out.println(12 << 2);
   
				12为正数，原反补相同，运算时用补码
				00000000 00000000 00000000 00001100		12的补码
				12向左移动1位,末尾补0
			 (0)0000000 00000000 00000000 000011000		24的补码
				12向左移动2位，末尾补0
			(00)000000 00000000 00000000 0000110000		48的补码
		*/
		/*
				System.out.println(12 >> 1);
				System.out.println(12 >> 2);
				12为正数，原反补相同，运算时用补码
				00000000 00000000 00000000 00001100		12的补码
				12,有符号右移，移动1位，最高位为0，右边补0
				00000000 00000000 00000000 00000110(0)	6的补码
				12,有符号右移，移动2位，最高位为0，右边补0
				00000000 00000000 00000000 00000011(00)	3的补码

		*/


		/*
			1.输入两个整数判断是否相等
			2.输入三个整数获取最大值
		*/
		import java.util.Scanner;     //导包
		
		class Test2_Scanner {
			public static void main(String[] args) {
				//创建键盘输入对象
				Scanner sc = new Scanner(System.in);
				System.out.println("输入第一个数：");
				//将键盘输入的整数存入x
				int x = sc.nextInt();
				System.out.println("输入第二个数：");
				//将键盘输入的整数存入y
				int y = sc.nextInt();
				System.out.println("x 与 y 相等吗？\t" + (x == y));
				System.out.println("输入第三个数：");
				//将键盘输入的整数存入z
				int z = sc.nextInt();
				int temp = (x > y) ? x : y;
				int max = (z > temp) ? z : temp;
				System.out.println(x+"\t"+ y+"\t"+z+"\t三个整数中最大的为\t"+max	);
			}
		}


##流程控制
 
 * if 和三元运算符的区别 
 	* 三元运算符能实现的，if语句都能实现，反之不行
 	* 当if语句控制的操作是一个输出语句时，只能用if，不能用三元运算符。因为三元运算符是一个运算符，运算符操作完毕就应该有一个结果，而不是一个输出。 
 * switch（表达式）
 	* 表达式可以是
 		* 基本数据类型：byte、short、char、int
 		* 引用数据类型：枚举类（JDK 1.5）、String 类（JDK 1.7）
	* case 后边只能是常量，不能使变量，多个case后面的值不能出现相同的
	* break 一般不能省略，省略后会出现 case穿透
	* default 无论放哪都是最后执行，一般放在最后
	* switch 结束只有2种情况
		* 遇到break
		* 遇到switch结束的右大括号
* switch 和 if 各自的使用场景
	* switch————判断固定值时使用
	* if————判断区间或范围的使用

			
				/*
					x = 2 没有与case匹配上，所以执行default
					default中没有break，所以继续执行default后面的case语句
					而后面的case语句中都没有break
					所以直到遇到switch结束的大括号停止
				*/
					int x = 2;
					int y = 3;
					switch (x) {
						default :
							y++;
						case 3:
							y++;
						case 4:
							y++;
					}
					System.out.println("y = "+y);     // y = 6

* 转义字符

	|	**		|	**		|
	|-----------|:---------:|
	|**\t**     | 一个tab键的位置|
	|**\r** 	|回车		|
	|**\n**		|换行		|
	|**\\'**		|  '  单引号|
	|**\\"**		|  "  双引号|


##数组

		int[] arr = new int[5];
		System.out.println(arr[0]);   //系统给出默认初始化值 ，整数类型的都是0
		System.out.println(arr);	  //   输出   [I@2a139a55
		/*
			[I@2a139a55  解释

			[	代表数组，几个就代表几维
			I	代表int型
			@	固定的符号
			2a139a55	代表的是16进制的地址

		*/

|	**	|	**          	    |默认初始化值|
|-------|:---------------------:|:----------:|
|整数类型|byte、short、int、long|0           |
|浮点类型|float、double         |0.0         |
|布尔类型|boolean               | false      |
|字符类型|char                  | \u0000     |

>	char 在内存中占2byte，是16个二进制位
						\u0000  中的每一个0代表的是16进制的0，那么4个0代表16个二进制位

* 存储
	* 1.栈——存储局部变量(局部变量：定义在方法声明中和方法中的变量)
		* 每个方法都是以栈针形式压栈

	* 2.堆——存储 new 出来的数组或对象
	* 3.方法区
		* 常量池是方法区的一部分	final修饰的变量存在此处
		* 静态区是方法区的一部分	static修饰的变量存在此处
	* 4.本地方法区————和系统相关
	* 5.寄存器——给CPU使用

* 数组的静态初始化

<hr/>	

		//声明和赋值可以分开写
		int[] arr = new int[]{11,22,33,44,55};  

		//静态初始化的简写形式，声明和赋值只能在同一行
		int[] arr2 = {11,22,33,44,55};          
	

* 常见异常
	* 当访问数组中不存在的索引时，出现数组越界异常
	* 当数组引用为null，再去调用数组中的元素时，会出现空指针异常
* 值传递
	* 基本数据类型的值传递，不改变原值（复制机制），因为调用后就会弹栈，局部变量随之消失
	* 引用数据类型(数组是引用类型）的值传递，改变原值，因为即使方法弹栈，但是堆内存的数组对象还在，可以通过地址继续访问
* 二维数组

```

	/*	
		三维数组的第一种定义格式
		int[][] arr = new int[3][2];
			这是一个二维数组
			这个二维数组中有3个一位数组
			每个一位数组中有2个元素	
		System.out.println(arr);		//二维数组
			//	[[I@2a139a55	二维数组的地址值    2个[[ 代表二维数组
		System.out.println(arr[0]);     //二维数组中的第一个一位数组
			//	[I@15db9742		一位数组的地址值	1个[  代表一位数组
		System.out.println(arr[0][0]);  //二维数组中的第一个一位数组的第一个元素
			//	0				元素值
	*/

		特列：	int[] x,y[]; 		    //x是一位数组，y是二维数组

	/*
		三维数组的第二种定义格式：
		int[][] arr = new int[3][];      //其中的一维数组的元素个数未定
		// 其中的一维数组的初始化值为null，示例如下：
		System.out.println(arr[0]);		输出： null		
		System.out.println(arr[1]);		输出： null
		System.out.println(arr[2]);		输出： null
		int[][] arr = new int[3][]; 
		arr[0] = new int[3];//第一个一维数组中可以存储3个int值
		arr[1] = new int[5];//第二个一维数组中可以存储5个int值	

		二维数组的第三种定义格式
		int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};
	*/	

```
	
##面向对象

|**				|成员变量		|局部变量		|
|---------------|:-------------:|:-------------:|
|在内存中的位置 |堆（成员变量属于对象，对象进堆）|栈（局部变量属于方法，方法进栈）|
|生命周期		|随着对象的创建而存在，随着对象的消失而消失|随着方法的调用而存在，随着方法的调用完毕而消失|
|初始化值|有默认初始化值				   |没有默认初始化值，必须定义、赋值，然后才能使用|

|数据类型	 |				包括|
|------------|:----------------:|
|基本数据类型|byte、short、int、long、float、double、boolean、char|
|引用数据类型|数组、类、接口、枚举|

* 匿名对象
	* 匿名对象只适合对方法的一次调用，因为调用多次会产生多个对象，不如用有名字的对象
	* 匿名对象可以当做参数传递
	* 匿名对象可以调用属性，但是没有意义，因为调用后就成为垃圾。如果需要赋值，还是用有名字的对象

* 构造方法
	* 当没有写出构造方法的时候，系统自动给出一个无参数的空的构造方法
	* 当给出构造方法，系统则不再给出默认的构造方法
		* 此时，若还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法

* static关键字
	* 特点
		* 随着类的加载而加载
		* 优先于对象存在
		* 被类的所有对象共享
			* 如果某个成员变量是被所有对象共享的，则他就因该被定义为静	态的
		* 通常使用类名调用
	* 注意事项————核心—————**静态只能访问静态**
		* 静态方法中没有this关键字
			* 静态是随着类的加载而加载，this是随着对象的创建而存在
			* 静态比对象先存在
		* 静态方法只能访问静态的成员变量和静态的成员方法
			* 静态方法只能访问————静态成员变量、静态成员方法
			* 非静态方法————无限制
	* 如果一个类中所有的方法都是静态的，要把构造函数私有化。目的是不让其他类创建本类对象。直接用类名.方法名调用即可

	* 在main()或静态方法中调用非静态方法必须通过创建对象调用

|**				|静态变量		|成员变量		|
|---------------|:-------------:|:-------------:|
|所属			|属于类			|属于对象		|
|内存中的位置	|方法区的静态区 |堆				|
|生存周期		|随着类的加载而加载，随着类的消失而消失|随着对象的创建而存在，随着对象的消失而消失|
|调用			|通过类名或对象	|只能通过对象	|
	

* 代码块--------------执行顺序：**静态代码块-->main() -->构造代码块**
	* 局部代码块————写在方法中的代码块
		* **只要是和局部有关的就都是跟方法有关的**
	* 构造代码块(初始化快)————写在类中方法外
		* 每创建一次对象执行一次，且优先于构造方法执行
		* （作用）多个构造方法中相同的代码存放到一起，每次调用构造代码块手执行，且先于构造方法执行
	* 静态代码块
		* 随着类的加载而加载，且只执行一次
		* 作用：给类进行初始化。一般用来加载驱动
		* 优先于main() 执行
* **继承**-------体现的是一种" is a "的关系
	* 子类只能继承父类所有非私有的成员变量和成员方法
		* 补充 ：**子类继承了父类的private修饰的成员变量，只是不能直接访问，需要通过父类开放出来的方法访问**
	* 子类不能继承父类的构造方法，但是可以通过super关键字访问父类构造方法
	* 不要为了部分功能而去继承
	* 子类中所有的构造方法默认都会范文父类中空参的构造方法
	* 
	* this 和 super 的区别
		* this既可以调用本类的，也可以调用父类的（本类没有的情况下）
		* 子类一定会通过  super(参数列表)  访问父类
		* this(...) 或 super(...)	必须出**现在构造方法的第一句**。同一个构造方法中，只能有其中一个。 

		|**			|this							|super		|
		|-----------|:-----------------------------:|:--------------------:|
		|代表什么	|代表当前对象的引用				|代表当前对象父类的引用|
		|调用成员变量|既可以调用本类的，也可以调用父类的（本类没有的情况下）|只能调用父类的|
		|访问		|this(参数列表)  访问子类构造方法		|super(参数列表)    访问父类构造方法|

* 继承中构造方法的关系
	* **子类中所有的构造方法默认都会访问父类中的空参的构造方法，即：如果没有在构造方法中写出this(...) 或super(...)，那么系统会自动加上super() 语句。**
		* 如果不写任何的构造方法，系统会默认添加一个无参构造；但是如果写了（哪怕就写了一个有参构造方法），系统就不再添加默认的无参构造
			* 因为子类会继承父类中的数据，可能还会使用父类的数据，所以，子类初始化之前，一定要先完成父类数据的初始化。
				* **实际上，不论哪个类，每一个构造方法的第一条语句默认都是 super()，如果没写继承哪个类，默认继承Object类**
	* 过程
		1. JVM 调用main() 方法，main() 进栈
		2. 加载父类的.class文件
		3. 执行父类的静态代码块    
		4. 加载子类的.class文件
		5. 执行子类的静态代码块	   
		6. 执行父类构造代码块
		7. 执行父类构造方法
		8. 执行子类构造代码块
		9. 执行子类构造方法
		
		>     java中是分层初始化，先初始化父类，再初始化子类，


	* 方法重写注意事项
		* 父类中私有方法不能被重写
			* 因为父类私有方法子类根本就无法继承
		* 子类重写父类方法时，访问权限不能更低，最好一致
		* 父类静态方法，子类也必须通过静态方法进行重写
			* 这实际不是重写。静态只能覆盖静态
		* 子类重写父类方法的时候，最好声明一模一样
		* 重写时，参数列表不能改变。

	|重写 override								|重载 overload		|
	|-------------------------------------------|:-----------------:|
	|子类中出现了和父类中方法声明一模一样的方法。|本类中出现的方法名一样，参数列表不同的方法|
	|与返回值类型有关，返回值是一致（或者是子父类）的|与返回值类型无关（可改变）| 

* final关键字
	* 修饰类，类不能被继承
	* 修饰变量，变量就成了常量，只能被赋值一次
	* 修饰方法，方法不能被重写
	* final 修饰的变量叫做常量，通常与public static 连用

		|final 修饰	|基本类型	|引用类型	|
		|-----------|:---------:|:---------:|
		|**			|值不能被改变|地址值不能被改变，对象中的属性可以被改变|

	* final 修饰变量的初始化时机
		* 显示初始化，
		* 在对象构造完毕前初始化。即在构造方法中进行初始哈

* **多态**
	* 多态前提
		* 有继承关系
		* 有方法重写
		* 有父类引用指向子类对象
	* 成员变量  	**^^^^**
		* 编译看左边（父类），运行看左边（父类）
	* 静态方法		**^^^^**
		* 编译看左边（父类），运行看左边（父类）
	* 成员方法		**！！！！**
		* 编译看左边（父类），运行看右边（子类）。（也叫动态绑定）
			* 编译时，看父类是否有该方法，，运行时，调用子类的方法
	* 总结：只有非静态的成员方法，编译看左边，运行看右边。
	* 向上转型————父类引用指向子类对象
	* 向下转型————  子类名  新变量名 = (子类名)原变量名;
	* 先有向上转型才有向下转型

	```java
	Father f = new Son();  //向上转型
	Son s = (Son)f;		   //向下转型 				也就是强制类型转换
	s.特有方法();          //调用子类特有方法      
	```

	|多态的有点										   |多态的缺点					  |
	|--------------------------------------------------|:----------------------------:|
	|1. 提高了维护性（继承保证）2. 提高了扩展性（多态保证）|不能使用子类的的特有属性和方法|

	* 当做参数的时候用多态最好，因为扩展性强

* 抽象类
	* 特点
		* 抽象类和抽象方法都必须用abstract关键字修饰
		* 抽象类不一定有抽象方法，有抽象方法的类一定是抽象类或接口
		* 抽象类不能直接实例化
			* 按照多态的方式，由具体的子类实例化。其实是多态的一种，抽象类多台
		* 抽象类的子类
			* 要么是抽象类
			* 要么重写抽象类中的所有抽象方法
	* 成员特点
		* 成员变量既可以是常量，又可以是变量
		* 有构造方法
		* 成员方法既可以是抽象的，也可以是非抽象的
	* abstract 不能和以下关键字一起使用

		|abstract 和 static				|
		|-----------------------------------|
		|被abstract修饰的方法没有方法体，被static修饰的方法可以用类名调用。用类名调用抽象方法是无意义的|
		|**abstract 和 final**					|
		|被abstract修饰的方法强制被子类重写，别final修饰的方法不能被子类重写。二者矛盾|
		|**abstract 和 private**			|
		|被abstract修饰的方法是为了让子类继承并重写，被private修饰的方法不能被子类访问。二者矛盾|

	* 如果一个抽象类没有抽象方法，有什么意义？
		* 不让其他类创建本类对象，交给子类完成。

* 接口
	* 概述
		* 狭义：java中的interface
		* 广义：对外提供规则的都是接口
	* 特点
		* 不能直接实例化 
		* 要按照多态的方式实例化
	* 接口的子类
		* 可以是抽象类，但意义不大
		* 可以是具体类。要重写接口中的所有抽象方法（推荐方案）。
	* 成员变量
		* 只能是常量，且是静态的、公共的
		* 默认修饰符：public static final  (三者顺序随意，习惯如左侧)
		* 建议手动给出
	* 没有构造方法
	* 成员方法————只能是抽象方法
		* 默认修饰符：public abstract
		* 建议手动给出

		|关系|类与类 				|类与接口					|接口与接口		|
		|----|:--------------------:|:-----------------:|:-----------------:|
		|	 |继承关系，且只能是单继承，可以多层继承|实现关系。可以实现多个接口，且可以在继承一个类的同时实现多个接口|继承关系。可以单继承，也**可以多继承**|

	* **接口和抽象类的区别**
		* 成员

		|	**	|成员变量		|成员方法		|构造方法		|
		|-------|:-------------:|:-------------:|:-------------:|
		|抽象类	|变量、常量		|抽象方法、非抽象方法|有		|
		|接口	|常量			|抽象方法		|无				|

		* 关系

		|类与类			|类与接口			|接口与接口			|
		|---------------|:-----------------:|:-----------------:|
		|继承。单继承	|实现。单实现、多实现|继承。单继承、多继承|

		* 设计理念
			* 抽象类————被继承体现的是：“ is a ” 的关系。抽象类中定义的是该继承体系的共性功能。
			* 接口————被实现体现的是：“ like a ” 的关系。接口中定义的是该继承体系的扩展功能。
* 包  package
	* 目的：对 .class 文件进行分类存放
	* package语句必须是第一条可执行的语句。
		*格式： package 包名    （多级包用 **.** 分开）。
	* package语句在一个java文件中只能有一个
	* 如果没有package，默认表示无包名。
	* 加包名后，类的完整名字是   包名 + 类名
	* 编译时直接创建包，且将 .class 文件放入包中，命令:
		* javac  -d  .  类名.java      
* 导包 import
	* 目的：让有包的类对调用者可见，不用完整类名了
	* 格式： import 包名.类名
	* 顺序：卸载package后面，class前面
* 4种权限修饰符

		|修饰符	  |本类		  |同一个包下（子类和无关类）|不同包下（子类）	  |不同包下（无关类）|
		|---------|:---------:|:------------------------:|:------------------:|:----------------:|
		|private  |√		  |							 |					  |				     |
		|default  |√		  |√						 |				 	  |					 |
		|protected|√		  |√						 |√					  |					 |
		|public   |√		  |√						 |√					  |√				 | 

* 内部类
	* 特点
		* 内部类可以直接访问外部类的所有成员，包括私有的。
		* 外部类要访问内部类的成员，必须创建对象
			* 格式： 外部类名.内部类名	变量名 = 外部对象.内部对象
			```java
				Outer.Inner oi = new Outer().new Inner();
			```
	* 若成员内部类被私有，则通过在外部创建一个访问内部类的方法，来让其他类调用该私有内部类。
	* 静态内部类
		* 调用静态内部类的非静态方法
		* 调用静态内部类的静态方法
		```java
		/*

			class Outer {
				static class Inner1 {
					//静态内部类的非静态方法
					public void method() {
						System.out.println("Inner1 method...");
					}
				}
			
				static class Inner2 {
					//静态内部类的静态方法
					public static void print() {
						System.out.println("Inner2 print^^^");
					}
				}
			}

			调用静态内部类的方法
			创建内部类对象
			理解：把静态成员内部类看做静态成员
			Outer.Inner1 oi = new Outer.Inner1();  
				Inner1为静态内部类，看做Outer的静态成员，
				创建Inner1的对象后用类名.调用，即：Outer.new Inner1()
				但书写习惯是new在最前面，所以最后写为 new Outer.Inner1()
				new 和 Inner1是一个整体，用来创建内部类的对象

			oi.method();

			调用静态内部类的静态方法
			一直类名.调用即可
			Outer.Inner2.print();			

		*/
		```
	* 内部类之所能获取到外部类的成员，是因为他能获取到外部类的引用：外部类名.this
	```java
		class Outer {
			int a = 10;
			class Inner {
				int a = 20;
				
				public void print() {
					int a = 30;
					System.out.println(a);
					System.out.println(this.a);
					//外部类名.this.变量名
					System.out.println(Outer.this.a);   
				}
			}
		}
	```
	* 局部内部类(开发时基本不用)
		* 局部内部类为什么在访问他所在方法中的局部变量是要用final？
			因为当调用这个方法时，局部变量如果没有用final修饰，它的生命周期和方法的生命周期是一样的，当方法弹栈，这个局部变量也会消失，那么如果局部内部类对象还没有马上消失且想用这个局部变量，就没有了。如果用final修饰，则会在类加载的时候让常量进入常量池，即使方法弹栈，常量池的常量还在，也可以继续使用。
	```java
		class Outer {
			public void method() {
				int num = 10;
				class Inner {
					public void print() { 
						System.out.println(num);
					}
				}
				//局部内部类只能在其所在的方法中访问
				Inner i = new Inner();
				i.print();
			}
		}

								补充：

		class Outer {
			public void method() {
		/*	
			要想让print() 方法访问num，


			------------JDK1.7规则----------------
			必须用final修饰num,
			即让num进入常量池，延长num的生命周期。



			-------------JDK1.8规则---------------
			取消了上面的规则，不用写final，同样可以让print() 访问num
		*/
				~~~final~~~ int num = 10;     
				class Inner {
					public void print() {
						System.out.println(num);
					}
				}
				//局部内部类只能在其所在的方法中访问
				Inner i = new Inner();
				i.print();
			}
		}
	```
	* 匿名内部类（是局部内部类的一种）
		* 在开发中的应用————当做参数传递。
		* 只针对重写一个方法的时候使用。
		* 不能向下转型，因为没有子类类名。
		* 前提：存在一个类或接口。
		* **本质**：是一个继承了该类或实现了该接口的子类匿名**对象**。
		* 格式： 
		```
						new 类名或接口名() {
							重写方法；
						};
		```

	```java
	interface Inter {
		public void print();
	}
	
									
	class Outer {
		public void method() {
	|----------------------------------------------------------------------
	|	//匿名内部类                                             |
	|	new Inter() {     //实现接口			             整体代表一个
	|		public void print() {    //重写抽象方法          实现Inter()接口
	|			System.out.println(" 匿名内部类的print..."); 的子类对象  
	|		}											     	|
	|	};												     	|
	|----------------------------------------------------------------------

			//匿名内部类
			new Inter() {     //实现接口									
				public void print() {   	//重写抽象方法				    
					System.out.println(" 匿名内部类的print...");
				}
			}.print();    //通过对象调用接口里的方法
		}
	}




	interface Inter {
			public abstract void show1();
			public abstract void show2();
		}
	
	class Outer {
		public void method() {
			//匿名内部类实现2个方法
			Inter i = new Inter() {		//父类引用指向子类对象
	
				public void show1() {		//方法重写
					System.out.println("show11111111111");
				}
				
				public void show2() {		//方法重写
					System.out.println("show22222222222");
				}
	        /*
				如果匿名内部类有自己的特有方法，则无法调用该特有方法
				即便通过指向该匿名内部类的父类引用也无法调用该方法
				因为在上转型时，编译时会检查父类里是否有要调用的方法
				如果没有，则无法通过编译。
				同时，也无法通过向下转型调用该特有方法，
				因为，没有子类类名，所以无法完成向下转型。
				综上，匿名内部类只针对重写一个方法时使用
	        */
	
			};
	
			//通过父类引用调用方法
			i.show1();
			i.show2();
		}
	}
	```

## java开发工具

 * jar ————多个.class文件的压缩包
 	* 作用：使用别人写好的东西
 	* 导入jar包
 		* 复制到项目路径下，并 Build Path-->add to Build Path
 

## 常见对象

 * toString()————更方便的属性值
 	* 如果直接打印对象的引用，默认调用toString() 方法
 * equals()————开发中通常重写，以用来比较对象的属性值
 	* 如果不重写，默认比较的是地址值
 * ==和equals()

 	|<center>==</center>																			|
 	|---------------------------------------------------------------------------|
 	|==是比较运算符，既可以比较基本数据类型，也可以比较引用数据类型，基本数据类型比较的是值，引用数据类型比较的是地址值|
 	|<center>equals()</center>								                                    |
 	|equals()只能比较引用数据类型。equals()没有重写时，比较的是地址值，底层依赖的是==，但比较地址值是无意义的，需要重写equals()来比较对象中的属性值|

* Scanner
	* hasNextXxx() 	即将要输入的是否为Xxx型，若是则返回true，否则为false
	* nextXxx() 	获取下一个输入项
	```java
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {		//判断输入的是否为int型
			System.out.println(sc.nextInt());
		}else {
			输入的不是int型
		}
	``` 

	* nextLine()   获取一个String型的值，即获取字符串
		* 典型问题：

		```java

		System.out.println("请输入1个整数：");		
		/*
			数字 + 回车  =    数字 + \r\n
		*/
		int i = sc.nextInt();
		System.out.println("请输入1个字符串");
		String line3 = sc.nextLine();
		/*
		 *	nextInt() 是键盘录入整数的方法，当我们录入10时，
		 *其实在键盘上录入的是10和\r\n，其中的\r\n是windous的回车
		 * nextInt() 方法只获取10就结束了
		 *	nextLine() 是键盘录入字符串的方法，可以接受任意类型，
		 *当nextLine() 遇到\r\n 边认为一行结束。
		 *	所以在键盘如的10\r\n中，10被nextInt()获取，
		 *nextLine()发现一行的结束符结束方法，也就是，
		 *nextLine()没有获取到任何内容。
		 *解决方法
		 *	1.创建2个对象，分别输入
		 *  2.键盘录入的都是字符串，都用nextLine()，然后将数字字符串转为数字
		 */
		System.out.println("i = " + i + "line3  = " + line3);

		```

* String
	* "abc" 可以看成是一个字符串对象
	* 字符串是常量，一旦赋值就不能改变
	* **常用构造方法**

		|常用构造方法				|作用						|
		|---------------------------|:-------------------------:|
		|public String(byte[ ] bytes)|byte[ ]--->String			|
		|public String(byte[ ] bytes,int offset,int length)|byte[ ]的一部分--->String,offset：开始的数组索引		length：指定转换的长度|
		|public String(char[ ] chars)|char[ ]--->String			|
		|public String(char[ ] chars,int value,int count)|char[ ]的一部分--->String|

		
	* **常用判断方法**
		
		|方法声明				|作用						|			
		|---------------------------|:-------------------------:|
		|boolean equals(String str)	|判断字符串的内容是否一样，区分大小写。如果字符串常量和字符串变量比较，通常都是字符串**常量调用equals()**，将变量作为参数传入，防止空指针异常|
		|boolean equalsIgnoreCase(String str)|同上，但不区分大小写		|
		|boolean contains(String str)		|判断是否包含传入的字符串	|
		|boolean startsWith(String str)|判断是否以传入的字符串开头		|
		|endsWith(String str)		|判断是否以传入的字符串结尾			|




		**<center>""和null的区别</center>**

		|""							|null						|
		|:-------------------------:|:---------------------------------:|
		|""是字符串常量，也是一个Sting类的对象，既然是对当然可以调用String类中的方法|null是空常量，不能调用任何的方法，否则会出现空指针异常, null常量可以给任意的引用数据类型赋值||

		|**""**是空串。**" "**不是空串，里面有一个空格|
		|---------------------------------------------|

	* **获取方法**

		|	方法声明					|作用							|
		|-------------------|:-----------------------------------------:|
		|int length() 		|获取字符串的长度，包含里面空格的个数		|
		|char charAt(int index)|获取指定位置的字符						|
		|int indexOf(int ch)|返回指定字符在字符串中第一次出现的索引，参数接受的是int，也可以穿char，传入char时，自动类型提升，如果字符串中没有要找的字符则返回-1|
		|int indexOf(String str)|获取指定字符串在字符串中第一次出现的索引（字符串的第一个字符出现的索引 ）|
		|int indexOf(int ch,int fromIndex)|获取指定字符在字符串中从指定位置后第一次出现的索引。jdk 8 搜索时包含开始位置，jdk 7 搜索时不包含开始位置|
		|int indexOf(String str,int fromIndex)|获取指定字符串在字符串中从指定位置后第一次出现的索引。jdk 8 搜索时包含开始位置，jdk 7 搜索时不包含开始位置。|
		|int lastIndexOf(int ch,int fromIndex)|从指定位置开始，从后往前找出指定字符第一次出现的索引				|
		|int lastIndexOf(int ch)|从后往前找指定的字符第一次出现的索引。jdk8  搜索时包含开始位置，jdk7 搜索时不包括开始位置。|
		|int lastIndexOf(int ch,int fromindex)|从指定位置向前找字符第一次出现的索引。jdk8  搜索时包含开始位置，jdk7 搜索时不包括开始位置|
		|String substring(int beginIndex)|从指定位置开始抽取字符串，一直到结尾，抽取的内容包括开始位置 |
		|String substring(int beginIndex,int endIndex)|抽取指定开始索引到结束索引之间的字符串，抽取的范围，左闭右开，[,)|

	* **转换方法**

		|方法声明&作用				|
		|---------------------------|
		|**方法：**byte[] getBytes() |
		|**作用：**String--->byte[]	|
		|   使用项目的使用码表进行编码，通常使用的是GBK，GBK中一个中文用2个字节表示，且第一个字节是负数|
		|**相互转换：**String(byte[] bytes)|
		|**方法：**char[] toCharArray()|
		|**作用:**String--->char[]|
		|**相互转换：**String(char[] chars)|
		|**方法：****static** String valueOf(...任意类型)|
		|**作用:**任意类型--->String|
		|是静态方法，直接用类名调用：String s = String.valueOf(参数);String 的 valueOf(Object obj) 方法，实际调用的是对象的toString()|
		|**方法：**String toLowerCase(String str)|
		|**作用:**把字母转成小写，其他符号或数字不变|
		|**方法：**String toUpperCase(String str)|
		|**作用:**把字母转成大写，其他符号或数字不变|
		|**方法：**String concat(String str)|
		|**作用:**拼接字符串|

		```
		char  --->   String
				1.String.valueOf(char c)
				2.String c = char + "";
		String   --->   char
				charAt(int index)
		当String对象由多个字符组成时，将该String对象看做一个char[],
		charAt(int index) 获取的是指定索引处的字符,
		索引可以把单个字母的String对象，看做只有一个元素的char[],
		charAt(0)就是获取只有一个元素的数组中的第一个元素。
		```


		|<center>+</center>	|concat()					|都用于String的拼接|
		|-------------------|:-------------------------:|:----------------:|
		|更强大，可以让String和任何类型拼接|调用的和传入的都必须是String|  |

	* 链式编程：只要保证每次调用完方法后返回的是对象，就可以继续调用。
	* 其他功能

		|方法声明&作用							|
		|---------------------------------------|
		|String replace(char old,char new) 		|
		|替换指定的字符							|
		|										|
		|String replace(String old,String new)	|
		|替换指定的字符串						|
		|										|
		|String trim() 							|
		|去掉String两端的空格					|
		|使用场景：用户输入用户名和密码时		|
		|										|
		|int compareTo(String str)				|
		|按字典顺序比较2个字符串的大小			|
		|										|
		|int compareToIgnoreCase(String str)	|
		|同上，但不区分大小写					|

	* 遍历字符串的方法：
		* 1.charAt（）
		* 2.toCharArray()
* StringBuffer————线程安全的可变字符序列
	* StringBuffer是一个可变的字符序列，String是一个不可变的字符序列
	* 常用构造方法
	
		|方法声明						|作用							|
		|-------------------------------|:-----------------------------:|
		|public StringBuffer() 			|无参构造						|
		|public StringBuffer(int capacity)|创建指定容量的字符串缓冲区对象|
		|public StringBuffer(String str)|创建指定字符串内容的字符串缓冲对象|
	
		|方法声明						|										|
		|-------------------------------|:-------------------------------------:|
		|int capacity() 				|返回当前容量。理论值					|
		|int length() 					|返回字符串的实际长度。实际值			|

	* 常用功能
		* 添加

		```java
		StingBuffer append(任意类型)  
		可以吧任意类型数据添加到字符串缓冲区里面，并返回中关村缓冲区本身

		StringBuffer insert(int offset , 任意类型)
		在指定位置之前把任意类型的数据插入到字符串缓冲区里面，并返回字符串缓冲区本身。
		```

		* 删除

		```java
		StringBuffer deleteCharAt(int index)
		删除指定位置的字符，并返回本身

		StringBuffer delete(int start,int end)
		删除从指定位置开始、指定位置结束的内容，并返回本身。
		删除范围：左闭右开     [ , )

		sb.delete(0, sb.length());		//清空缓存区
		```

		* 替换

		```java
		StringBuffer repalce(int start,int end,String str)
		替换指定范围的字符串，范围：左闭右开   [ , )

		StringBuffer reverse()
		字符串反转
		```

		* 截取

		```java
		String substring(int start)
		从指定位置截取到末尾，包括指定的那个位置，返回值类型为String

		String substring(int start,int end)
		截取指定范围的字符串，范围：左闭右开   [ , )  ,返回值类型为String
		```
		
		* String	<---->		StringBuffer
			* String --->  StringBuffer
				* 1.构造方法		StringBuffer(String str)
				* 2.append()
			* StringBuffer --->  String
				* 1.构造方法	String(StringBuffer sb)
				* 2.toString()    **常用**
				* 3.substring(0,str.length())

			```java
						//String --> StringBuffer

			String s = "helloworld";

			//1.StringBuffer 的构造方法
			StringBuffer sb = new StringBuffer(s);
			System.out.println(sb);

			//2.StringBuffer的append() 方法
			StringBuffer sb2 = new StringBuffer();
			sb2.append(s);
			System.out.println(sb2);
	

						//tringBuffer --> String

			StringBuffer sb = new StringBuffer("helloworld");
			
			//1.String的构造方法
			String s1 = new String(sb);
			System.out.println(s1);

			//2.StringBuffer的toString()
			System.out.println(sb.toString());

			//3.StringBuffer的截取方法substring(int start,int end)
			String s2 = sb.substring(0, sb.length());
			System.out.println(s2);
			```
		
		|**			|String				|StringBuffer			|StringBuilder			|
		|-----------|:-----------------:|:---------------------:|:---------------------:|
		|字符序列	|不可变				|可变					|可变					|
		|线程		|					|安全					|不安全					|	

* 算法
	* 冒泡排序
		* 相邻元素，大的往后放，第一次完毕，最大值出现在最后的外置，第二次比较完毕，第二大的元素，在倒数第二的位置，以此类推。
	* 选择排序
		* 从0索引开始，依次和后面元素比较，小的往前放，最小值出现在了最小索引处。
	* 二分查找
		* 查找元素对应的索引
		* 前提：数组元素有序

		```java
		public static void selectSort(int[] arr) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i]  > arr[j]) {
						int tem = arr[i];
						arr[i] = arr[j];
						arr[j] = tem;
					}
				}
			}
		}
	


		public static void bubbleSort(int[] arr) {
			for (int i = 0; i < arr.length - 1 ; i++) {
				for (int j = 0; j < arr.length - i - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						int tem = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = tem;
					}
				}
			}
		}

		public static int binarySearch(int[] arr, int a) {
			int min = 0;
			int max = arr.length - 1;
			int mid = (max + min) / 2;
			while (arr[mid] != a) {
				if (a > arr[mid]) {
					min = mid + 1;
				}else if (a < arr[mid]) {
					max = mid - 1;
				}
				mid = (max + min) / 2;
				if (min > max ) {
					return -1;
				}
			}
			return mid;
		}
		```

* Arrays
	* 针对数组进行操作的工具类
	* 方法
	```java
				Arrays的方法都是静态方法，直接类名调用

	数组  --->  String
	public static String toString(基本数据类型的数组)
	
	排序，升序
	public static void sort(基本数据类型的数组)
	
	查找索引
	public static int binarySearch(基本数据类型的数组,int key)
	```

* 基本数据类型和包装类

	|基本数据类型	|对应的包装类	|
	|---------------|:-------------:|
	|byte			|Byte			|
	|short			|Short			|
	|int			|Integer		|
	|long			|Long			|
	|float			|Float			|
	|double			|Double			|
	|char			|Character		|
	|boolean		|Boolean		|

	* 将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
	* int  <---->  String
	```
	// int ---> String
		int i = 100;

		// 1.
		String s1 = i + ""; // 推荐用
		// 2.
		String s2 = String.valueOf(i); // 推荐用
		// 3.
		Integer ii = new Integer(i);
		String s3 = ii.toString();
		// 4.
		String s4 = Integer.toString(i);

	//String ---> int
		String s = "200";
		
		//1.
		Integer i = new Integer(s);
		int i1 = i.intValue();
		
		//2.
		int i2 = Integer.parseInt(s); 		//推荐用

		8种基本数据类型包装类中，除了Character外，
		都有静态方法parseXxx()，用来将其转成原来的类型。
	```

	* JDK 1.5 新特性
		* 自动拆、装箱
			* 自动装箱：基本数据类型 ---> 包装类型
			* 自动拆箱：包装类型 ---> 基本数据类型
				* **当 Integer x = null 时**，不能使用自动拆、装箱，否则空指针异常
				* **-128——127是byte的取值范围，如果在这个范围内取值，自动装箱就不会新创建对象**，而是从常量池中取，如果超过了byte取值范围就会新创建对象
		* 可变参数
		* 增强型for循环
		```java
		Integer ii1 = new Integer(i1);       //手动装箱
		int i2 = ii1.intValue();				//手动拆箱
		
		//JDK 1.5 新特性
		Integer j = 100;		//自动装箱
		int j1 = j + 1;			//自动拆箱

		//错误示范
		Integer i = null;		
		//底层i调用intValue(),
		//但是i是nul，null调用方法就会发生空指针异常
		int i2 = 2 + i;				
		System.out.println(i2);     

		//特例
		Integer i1 = 123;
		Integer i2 = 12;
		System.out.println(i1 == i2);		//false
		System.out.println("-------------------------");
		
		Integer j1 = -128;
		Integer jj1 = -128;
		System.out.println("j1 == jj1 ?" + (j1 == jj1));	//true
		
		Integer k1 = 12;
		Integer kk1 = 12;
		System.out.println("k1 == kk1 ? " + (k1 == kk1));	//true
		Integer i3 = 127;
		Integer ii3 = 127;
		System.out.println("ii3 ==i3 ? " + (ii3 ==i3));		//true
		
		Integer i4 = 128;
		Integer i5 = 128;
		System.out.println(i4 ==i5);		//false
		
		Integer i6 = 223;
		Integer i7 = 223;
		System.out.println(i6 == i7); 		//false
		```

##正则表达式
* 是指一个用来描述或者匹配一系列符合某个规则的字符串的单个字符串。就是一种规则。
* 预定义字符
	*  **.**代表任意字符，一个.代表一个字符，2个.代表2个字符。几个.代表几个字符
	* \d表示一个数字，  [0,9]
	* \D  非数字   [^0-9]
	* \s 空白字符  [\t\n\x0b\f\r]
	* \S   非空白字符 [^\s]
	* \w 单词字符   [a-zA-Z_0-9]
	* \W  非单词字符  [^\w]
* 分割	
	* String类的的方法  
		* String [] split(String regex)   
* 替换
	* String类的方法
		* String replaceAll(String regex,String replacement)
* 数量词
* 分组

	```java
		String regex = "[abc]";    //a或b或c，  [ ] 代表单个字符
		String regex = "[^abc]";  // ^ 表示除了，即除了a,b,c外的单个字符
		String regex = "[a-zA-Z]";	//单个字符，a 到 z或者A到Z
		String regex = "[a-dm-p]";	//a-d和m-p取并集
		String regex = "[a-z&&d-f]";		//取交集
		String regex = "[a-z&&[^bc]]";		//a-z的范围里面去b和c,取并集


		String regex = ".";	
		String regex = "\\d";		//  \代表转义字符，要输入\d必须输入\\d
		String regex = "\\D";
		String regex = "\\s";
		String regex = "\\S";
		String regex = "\\w";
		String regex = "\\W";

			//数量词
		//  a,b,c中的其中一个出现1次或0次
		String regex = "[abc]?";

		//	[abc]*  包含a,b,c零次或多次
		String regex = "[abc]*";

		//  a,b,c 出现一次以上
		String regex = "[abc]+";

		//	a,b,c中每个字母出现的次数之和为5,且其中不能有除abc之外的字符
		String regex = "[abc]{5}";

		// a,b,c其中每个字母出现的次数之和大于等于5，且其中不能有除abc之外的字符
		String regex = "[abc]{5,}";

		//a,b,c中，每个字母出现的次数之和大于等于5，小于等于15,且不能有其他字符
		String regex = "[abc]{5,15}";


	
		*********调用正则表达式*********
		System.out.println("hello".matches(regex));

		String s2 = "sony.GBA.XBox";
		//特殊的转译    用 . 去切割的时候，正则表达式中的表示为   "\\."
		String[] arr2 = s2.split("\\.");

		String s1 = "psp1312sony0xbox9gba";
		String regex = "\\d";	//任意数字
		String s2 = s1.replaceAll(regex, "");

		
		(.)代表一组，  
		 \\1代表让第一组再出现一次    + 表示\\1 出现一次以上
		String regex = "(.)\\1+";
		String[] arr = s.split(regex);


		(..)表示第一组，在第一组中，两个字符是任意的
		\\1表示把第一组重新出现一次
		String regex = "(..)\\1";
		System.out.println("高兴高兴".matches(regex));

		(.)代表第一组    \\1 代表让第一组再出现一次
		第二个(.)  代表第二组   \\2  代表让第二组再出现一次
		String regex = "(.)\\1(.)\\2";


		String s = "我我...要...要要..学..学..学.编.
					.编编....程...程程...程.程..";
		String s1 = s.replaceAll("\\.", "");		//去掉 . 点
		System.out.println(s1);
		//$1代表 第一组中的内容，即重复的那一个字符
		String s2 = s1.replaceAll("(.)\\1+", "$1");  
		System.out.println(s2);
	```
##常用类
* Math

	```java
	//取绝对值
		System.out.println(Math.abs(-1231.24));
		System.out.println("---------------");
	//向上取整 		double ceil(double i)       12.1-->13   12.9-->13
		System.out.println(Math.ceil(12.1));		//返回double型
		System.out.println(Math.ceil(12.9));		//返回double型
	//向下取整		double floor(double i)		12.1-->12	12.9-->12
		System.out.println(Math.floor(12.1));		//返回double型
		System.out.println(Math.floor(12.9));		//返回double型
	//取两个数的最值		max(... , ...)		min(... , ...)
		System.out.println(Math.max(12, 90));
	//a的b次方		double pow(double a,double b)  
		System.out.println(Math.pow(15, 2));
	//生成0.0（含）到1.0（不含）之间的数		random()  
		System.out.println(Math.random()); 
	//小数点后第一位四舍五入，输出int		int round(...)	
		System.out.println(Math.round(14.4f));
		System.out.println(Math.round(14.5f));
	```

* Random
	* 产生随机数，用的时候导包，java.util.Random;

	```java
	Random r = new Random();		//无参构造方法

	//有参构造方法，传一个long型的值作为种子参与运算，
	//种子定下来，随机数就固定不变
	Random r = new Random(long seed);
	
	//产生一个在[ 0 , 100] 之间的值，即括号中传入的数不包括
	System.out.println(r.nextInt(101)) 		

	//产生一个随机数，有正有负
	System.out.println(r.nextInt());
	```

* System
	* 该类的方法全是静态方法，直接用类名调用
	* System.gc()   运行垃圾回收器。
	* System.exit(int status);	关闭虚拟机。status 为0 是正常关闭（通常传0），非0为异常终止
	* System.arraycopy(Object src,int secPos,Object dest,int destPos,int length)   复制数组
	* System.currentTimeMillis() 	获取当前的毫秒值（从1970年1月1日0点到现在的毫秒值）
	```java
		int[] arr = {11,22,33,44,5,6,7,};
		int[] arr2 = new int[9];
		//把arr[]从0索引开始复制全部到arr2[],从arr2[]的2索引开始填入
		System.arraycopy(arr, 0, arr2, 2, arr.length);

		long start = System.currentTimeMillis();	//获取当前时间的毫秒值

	```

* BigInteger
	* 用于超大整数计算

	```java
	BigInteger i1 = new BigInteger("346546879613215465487987135132164687");
	BigInteger i2 = new BigInteger("846513164684687643131565464687546546");
	BigInteger i3 = i1.add(i2);			//	+
	BigInteger i4 = i1.subtract(i2);	//	-
	BigInteger i5 = i1.multiply(i2);	//	*
	BigInteger i6 = i1.divide(i2);		//	÷
	```

* BigDecimal
	* 为了更精确的存储小数

	```java
	BigDecimal b3 = new BigDecimal("2.0");	//推荐使用，传String，精确
	BigDecimal b4 = new BigDecimal("1.1");
	System.out.println(b3.subtract(b4));

	
	BigDecimal q1 = BigDecimal.valueOf(2.0);	//推荐使用，静态方法，精确
	BigDecimal q2 = BigDecimal.valueOf(1.1);
	System.out.println(q1.add(q2));			//	+
	System.out.println(q1.subtract(q2));	//	-
	System.out.println(q1.multiply(q2));	//	*
	System.out.println(q1.divide(q2));		//	÷

	BigDecimal b1 = new BigDecimal(2.0);	//不精确
	BigDecimal b2 = new BigDecimal(1.1);
	System.out.println(b1.subtract(b2));
	```

* Date
	* 在java.util.Date包下



	```java
	Date d2 = new Date(0);
	/*
		显示的是	Thu Jan 01 08:00:00 CST 1970
		是8点而不是0点。
		因为存在系统时间和本地时间的问题，其实系统时间依然是0点，
		只不过电脑的时区设为东8区，顾输出的是8点
	*/
	System.out.println(d2);


	Date d = new Date();
	System.out.println(d);		//输出当前时间

	System.out.println(d.getTime());	//通过Date对象获取毫秒值
	System.out.println(System.currentTimeMillis());	//通过系统类的方法获取毫秒值
	
	Date d2 = new Date(0);		//通过毫秒值创建时间对象
	System.out.println(d2);

	Date d2 = new Date();
	d2.setTime(2000); 	//设置毫秒值，改变时间对象

	```

* SimpleDateFormat
	* Date --->  String
		* String format(Date date)
	* String --->  Date
		* Date parse(String str)

```java
Date d = new Date();	//创建当前时间对象
SimpleDateFormat sdf = new SimpleDateFormat();	//创建日期格式化类对象
System.out.println(sdf.format(d));		//输出	16-3-1 上午5:54

//Date --->  String
	Date d = new Date();	//创建当前时间对象
	//创建日期格式化类对象，在构造方法中给出日期的显示格式
	SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy年MM月dd日 HH:mm:ss 这是今年的第DD天 第ww周 是MM月的第WW周");
	System.out.println(sdf.format(d));	//将日期类对象转换为String

//表示日期的String --->  Date
	String date = "2016年03月01日 06:07:39";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
	Date time = sdf.parse(date);
	System.out.println(time);	//将时间String转换为日期对象

```

* Calendar
	* Calendar 类中的Calendar.MONTH比实际值小1，所以要+1
	* Calendar.DAY_OF_WEEK 第一天是周日，最后一天的周六，返回值从1到7,需要另外设置方法进行转换
	* add(int field,int amount)    把年月日等field值，加上amount，如果amount为负数，则为减
	* set(int field,int amount)    把年月日等设为指定的值

	```java
	Calendar c = Calendar.getInstance();	//父类引用指向子类对象
	//把年数加20 ，如果把20改为负数，在为把年数减去一个数
	c.add(Calendar.YEAR,20 );		
	```

##集合

|集合和数组的区别|		集合		|		数组		|
|----------------|:----------------:|:-----------------:|
|存储的类型		 |引用类型			|基本类型、引用类型	|
|长度			 |可变				|固定				|
|适用场景		 |元素个数变化		|元素个数固定		|


|**		|**		|Collection	(单列集合的跟接口)|**		|**		|
|-------|:-----:|:---------------------------:|:-------:|:-----:|
|		|	↗	|							  |		↖	|		|
|		|List  接口	有序（存和取顺序一致），有索引元素可重复|		|Set  接口	无序（存和取的顺序不一致），无索引，元素不能重复|		|
|	↗	|	↑	|	      	↖			  |		↑	|	↖	|
|ArrayList|LinkedList|Vector				  |HashSet  |TreeSet|		
|数组实现 |链表实现	 |数组实现				  |哈希算法 |二叉树算法|


* Collection
	* boolean add(E e) 		添加元素
	* boolean remove(Object o)		删除指定元素
		* **底层依赖的是equals(Object obj)**，必要时需要重写该方法。
	* void clear() 		清空集合
	* boolean contains(Object o) 	判断是否包含指定元素
		* 判断是否包含，**底层依赖的是equals(Object obj)**，必要时需要重写该方法。
	* boolean isEmpty() 		判断集合是否为空
	* int size() 		获取集合中元素的个数
	* 相关
		* List集合的add()始终返回true，因为List中的元素可以重复
		* Set集合的add()在元素重复时返回false
		* ArrayList的父类的父类重写了toString(),所以在打印ArrayList对象的引用时，输出结果和Object中的的toString()结果不一致
	* boolean addAll(Collection c)     集合相加
	* boolean removeAll(Collection c) 	删除交集
	* boolean containsAll(Collection c)		判断是否包含指定集合
	* boolean retainAll(Collection c ) 		获取交集
	
		```java
		//获取交集，当调用集合被改变时，返回true，保持不变返回false
		System.out.println(c1.retainAll(c2));
		```
* List
	* List接口的3个子类：ArrayList、LinkedList、Vector
	* void add(int index,E element)		在指定位置插入元素
	* E remove(int index) 		删除指定位置处的元素
	* E get(int index)		获取指定位置的元素
	* E set(int index,E element) 	改变指定位置的元素
	* List专有迭代器ListIterator
		* 可以再迭代过程中插入元素
		* 可以正向或反向迭代

		```java
		List list = new ArrayList();
		// 自动装箱
		list.add(111);
		list.add(222);
		list.add(333);
		//删除指定索引的元素
		//删除元素时，不会自动装箱，而是把传入的参数当做索引
		Object o = list.remove(111);	
		//手动装箱，传入对象才能准确删除
		Object o = list.remove(new Integer(111)); 


		//获取List专有迭代器ListIterator，可以再迭代时插入元素
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			String s = (String)lit.next();
			if ("world".equals(s)) {
				lit.add("javaEE");		//当找到 world 后，直接插在其后面
			}
		}

		//正向遍历
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("-----------------------");
		//逆向遍历      在逆向遍历之前必须先进行正向遍历让游标指向最后一个元素
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		```

		|		**	|ArrayList			|LinkedList			|Vector			|
		|-----------|:-----------------:|:-----------------:|:-------------:|
		|底层数据结构|数组				|链表				|数组			|
		|适用		|查询				|增、删				|				|
		|线程		|不安全				|不安全				|安全			|
	
	* LinkedList
		* void addFirst(E e) 	将元素添加到头部
		* void addLast(E e ) 	将元素添加到尾部
		* E removeFirst() 		删除头部的元素
		* E removeLast() 		删除尾部的元素
		* E getFirst() 			获取头部元素
		* E getLast() 			获取尾部元素
		* E get(int index) 		获取指定索引处的元素

##泛型
* 优点
	* 提高安全性
	* 不用再进行强转
* 注意事项
	* 菱形语法：只在前面写出引用类型即可
	* 当前后都写出类型时，要保证前后的数据类型一致
	* 泛型最好不要定义成Object，没有意义
* 泛型通配符	<?>
	* ? extends E
		* 固定上边界，向下限定，E及其子类
	* ? super E
		* 固定下边界，向上限定，E及其子类


	```java
	//带泛型的接口
	interface Inter<T> {
		public void show(T t);
	}
	// 实现带泛型的接口的2中方式

	class Demo implements Inter<String> {	//推荐使用
	
		@Override
		public void show(String t) {
			System.out.println(t);
		}
	}
	
	class Demo2<T> implements Inter<T> {	//没有必要在实现接口时给类添加泛型
		@Override
		public void show(T t) {
			System.out.println(t);
		}
	}	

	//当右边的泛型不确定时，左边的泛型可以指定为 ？，其中的？代表任意类型
		List<?> list = new ArrayList<Integer>();	
	```
* 增强型for循环
	* 简化数组和Collection集合的遍历
	* 底层由迭代器实现
	* 对集合只能遍历，不能删除
	
* 三种迭代方式中只有2种可以删除元集合中的素

|					|普通for循环		|迭代器			|增强型for循环		|
|-------------------|:-----------------:|:-------------:|:----------------:|
|能否在遍历时删除元素|可以删			|可以删			|不能				|
|注意				|索引要**减减** 即：**index-** **-**		|必须用**迭代器的remove()**|只能遍历|

```java

		//1. 普通for循环 删除，注意索引要减减，remove(i--)
		for (int i = 0 ; i < list.size();i++) {
			if ("b".equals(list.get(i))) {
				 /* remove(int index)的原理
				  * ArrayList通过数组实现，当删除一个元素时，
				  *被删除元素后面的所有元素都要往前挪一个位置，
				  */
				list.remove(i--);
				System.out.println("已经删除b");
			}
		}

		//2. 用Iterator迭代器删除
		Iterator<String> it = list.iterator();
		while( it.hasNext()) {
			if ("b".equals(it.next())) {
			//	list.remove("b");	
				 * 在迭代器循环中，不能使用集合的remove(...)
				 * 只能使用迭代器的remove()进行删除
				it.remove();
			}
		}

		//使用for循环的Iterator
		for (Iterator<String> it = list.iterator();it.hasNext();) {
			if ("b".equals(it.next())) {
				it.remove();	//使用迭代器的remove()进行删除
			}
		}
		System.out.println(list);
	}
```

* 静态导入
	* 用于导入类中的静态方法
	* 格式：
	```java
		import static 包名.类名.方法名;
	```
	* 开发时不用，但得能看懂
* 可变参数
	* 可变参数其实就是一个数组
	* 定义方法的时候不知道要定义多少个参数
	* 如果一个方法有可变参数，并且有多个参数，那么可变参数肯定是最后一个
	* 格式：（在数据类型后面加3个点   **...**）
		```java
		修饰符  返回值类型  方法名（数据类型...  变量名）
		```
	```java
	public static void main(String[] args) {
		int[] arr = {12,12,31,312,312,31,321,31,3};
		bian(arr);		// 能接收数组
		bian(57,5,75,756,76,75,7);		//能接收任意多个值
	}

	public static void bian(int...arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	```

* 数组	<---->	集合 0
	* 数组	----> 	集合 
		* asList(...)
		* 数组转成集合虽然**不能添加或减少元素**，但可以用集合的思想操作数组，即使用集合中的其他方法
	```java
			基本数据类型的数组转换为集合，会将整个数组当做一个对象转换
		==65	整个数组作为一个元素存入List集合中
			集合中只能存储引用类型，数组就是一个引用类型，
			而数组中的元素时基本数据类型。
			泛型为 <int[]>
		int[] arr = {34,12,3,123,2,543,123,12,313,12,312,31}; 
		List<int[]> list = Arrays.asList(arr);
		System.out.println(list);		//输出数组arr 的地址值
			
	
			将数组转换成集合，数组必须是引用类型，
			即用基本数据类型对应的===包装类===来创建数组
		Integer[] arr = {3,42,3,453,5,46,6,45,634,56,457,56,86};     
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);		//输出所有的元素
	```
	* 集合 ---->   数组
		* toArray(...)
		```java
		当集合转数组时，数组长度小于等于集合的size时，转换后的长度等于集合的size
		如果数组的长度大于集合的size，分配的数组长度就和指定的长度一样

		ArrayList<String> list = new ArrayList<>();
		....添加4个元素....
								  //new String[数组长度]
		String[] arr = list.toArray(new String[0]);		//数组的长度指定为0
		//数组的长度为12，大于集合的size=4，所以输出为 4个元素 + 8 个null
		String[] s = list.toArray(new String[12]);		
		```

* Set————无索引，不可重复，无序（存取不一致）

	|			|HashSet（常用）		|LinkedHashSet				|TreeSet				|
	|-----------|:---------------------:|:-------------------------:|:---------------------:|	
	|底层		|哈希算法				|链表实现，哈希算法			|二叉树					|
	* HashSet
		* 原理
			* 使用Set集合都是需要去掉重复元素的，如果在存储的时候逐个equals()比较，效率较低，哈希算法提高了去重复的效率，降低了使用eqeuals()方法的次数。
			* 当HashSet调用add()方法存储对象的时候，先调用对象的hashCode()方法得到一个哈希值，然后在集合中查找是否哈相同哈希值的对象
				* 如果没有哈希值相同的对象就直接存入集合
				* 如果有哈希值相同的对象，就和哈希值相同的对象逐个进行eqeuals()比较，比较结果为false则存入，为true则不存。
		* 将自定义类的对象存入HashSet去重复
			* 类中**必须重写hashCode()和equals()方法**
			* hashCode() : 属性相同的对象返回值必须相同，属性不同的对象返回值 尽量不同（提高效率）
			* equals() : 属性相同返回true，属性不同返回false，返回false时存储
		* 判断是否为同一个元素：
			* 当2个元素的hashCode()值相等，且equals(Object obj)返回true
			* 先比较hashCode()值，相等时再执行equeals(Object obj) 方法

	```java
	HashSet<String> hs = new HashSet<>();	//创建HashSet对象
	boolean b1 = hs.add("a");
	boolean b2 = hs.add("a");	//当向HashSet中添加重复元素时返回false
	System.out.println(hs);		//HashSet的继承体系中重写了toString()
	for (String string : hs) {		//只要能用迭代器的，就能使用增强型for循环
		System.out.println(string);
	}

	public int hashCode() {
		final int prime = 31;
			为什么是31？
			1. 31是质数
			2. 既不大也不小
			3. 便于计算。31 = 32 - 1，  32是2的5次方， 2向左移动5位，再减一
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	```
	
	* LinkedHashSet
		* 底层是链表实现的，是**Set集合中唯一一个存取顺序相同**的集合对象
		* 因为是HashSet的子类，索引也是保证元素唯一的，与HashSet的原理一样
	* TreeSet
		* 特点：是用来对元素进行排序的，可以保证元素的唯一
		* 使用方式：
			* 1.自然排序 （Comparable）————从小到大
				* TreeSet类的add(...)方法会把存入的对象提升为Comparable类型，所以如果存入的对象没有实现Comparable接口会报错：类型转换异常
				* 调用对象的compareTo(...)方法和集合中的对象进行比较。要存入的对象调用该方法，将已经存在于集合中的对象当做参数传进去。
				* 根据compareTo(...)方法返回的结果进行存储
			* 2.比较器排序（Comparator）————定制规则
				* 创建TreeSet时制定一个Comparator
				* 如果传入了Comparator的子类对象，那么TreeSet就会优先按照比较器中的规则进行排序
				* add(...)方法内部会自动调用Comparator接口中的compare(T o1, To o2)方法进行排序
			* 两种方式的区别
				* TreeSet空参构造，默认按照自定义类中Comparable的顺序
				* TreeSet构造方法中传入Comparator，则优先按照Comparator的规则排序
		* 存储结构：二叉树结构，存储时左小右大，输出时顺序为中序遍历，总是从小往大输出
		* 可以在TreeSet的构造方法中传入一个Comparator（接口）比较器来自定义排序规则
		* **自定义类，要么在自定义类中实现Comparable接口，并重写compareTo(T o) 方法，要么在TreeSet的构造方法中传入Comparator比较器**
		* 关于Comparable接口，**8中基本数据类型的包装类都实现了该接口并重写了compareTo(T o) 方法**

		```java
		//自定义类实现Comparable接口
		public class Person implements Comparable<Person>{
		private String name;
		private int age;
		...构造，get，set...
		重写接口中的int comparaTo(T o)方法,     该接口中只有这一个方法
		//按照姓名的长度排序
			public int compareTo(Person o) {
			int length = this.name.length() - o.name.length();
			int num = length == 0 ? this.name.compareTo(o.name) : length;
			return num == 0 ? this.age - o.age : num;
			}
		}



		//创建比较器
		//创建一个类，实现Comparator接口
		class CompareByLen implements Comparator<String> {
			//重写int compare(T o1,T o2)方法
			public int compare(String o1, String o2) {
				int length = o1.length() - o2.length();		//比较长度
				int num = length == 0 ? o1.compareTo(o2) : length;	//比较内容
				return num;	
			}
			/*
			 * Comparator接口中有compareTo(...)和equeals(...)2个方法
			 * CompareByLen类默认继承Object类，而Object类中重写了eqeuals(...)方法
			 * CompareByLen类继承了Object类中的equals(...)方法，
			 * 相当于已经有了，所以不用重写
			 */
		}

											//匿名内部类
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) { 	
				int num = o1.compareTo(o2);
				//保留重复元素
				int result = num != 0 ? num : 1;	
				return result;
			}
		});
		```

* Map
	* 双列集合
	* LinkedHashMap
		* 保证键的唯一，保证存取顺序一致

	|			|HashMap（常用）		|LinkedHashMap			|TreeMap			|
	|-----------|:---------------------:|:---------------------:|:-----------------:|
	|底层针对键	|哈希算法				|链表					|二叉树				|

```java
Map<String,Integer> map = new HashMap<>();
map.put("张三", 23);		//添加元素
map.put("李四", 24);
map.put("王五", 25);
map.put("赵六", 26);
//相同键值不存储，进行的是value值覆盖，把被覆盖的value值返回
Integer i = map.put("张三", 99);
System.out.println(i);
System.out.println(map);
Integer i2 = map.remove("王五");		//根据键删除元素，返回键对应的值
System.out.println(i2);
System.out.println(map);
//判断是否包含指定的键
System.out.println(map.containsKey("李四")); 
//判断是否包含指定的值
System.out.println(map.containsValue(24));
//获取所有的值，返回Collection
Collection<Integer> c = map.values();
System.out.println(c);
//获取map中的元素个数
System.out.println(c.size());


遍历方式1.1
Set<String> keyset = map.keySet();
Iterator<String> it = keyset.iterator();
while (it.hasNext()) {
	String key = it.next();
	Integer i = map.get(key);
	System.out.println(key + " = " + i );
}

遍历方式1.2         ======推荐使用======
for( String key : map.keySet()) {
	System.out.println(key + " = " + map.get(key));
}


遍历方式2.1
public static void mapEntry(Map<String, Integer> map) {
//Map.Entry说明Entry是Map的内部接口。
//将键和值封装成了Entry对象，并存储在Set中
//HashMap类中的内部类Entry其实是Map.Entry接口的子类（实现类） 
Set<Map.Entry<String,Integer>> entryset = map.entrySet();
//用Iterator迭代器遍历Set，获取每一个Entrt对象，
//每一次拿到的都是Map.Entry<String,Integer>对象
//所以Iterator的泛型为<Map.Entry<String,Integer>>
Iterator<Map.Entry<String, Integer>> it = entryset.iterator();
while (it.hasNext()) {
	//获取每一个Entry对象
	Map.Entry<String, Integer> entry = it.next(); //父类引用指向子类对象
	//直接获取的是子类对象（导包 java.util.Map.Entry）
	//Entry<String, Integer> entry = it.next();	
	String key = entry.getKey();		//从Entry对象中获取键
	Integer value = entry.getValue();	//从Entry对象中获取值
	System.out.println(key + " = " + value);
}

遍历方式2.2           ======推荐使用======
for (Map.Entry<String, Integer> en : map.entrySet()) {
	System.out.println(en.getKey() + " = " + en.getValue());
}
或（要导包 java.util.Map.Entry）
for (Entry<String, Integer> en : map.entrySet()) {
	System.out.println(en.getKey() + " = " + en.getValue());
}


public static void main(String[] args) {
	String s = "qweqweqewqqw";
	char[] arr = s.toCharArray();
	HashMap<Character, Integer> hm = new HashMap<>();
	for (char ch : arr) {
		/*if (!hm.containsKey(ch)) {
			hm.put(ch, 1);
		} else {
			//通过键得到值  value  get(key)
			hm.put(ch, hm.get(ch) + 1);
		}*/
		//把if优化为三元运算符
		hm.put(ch, !hm.containsKey(ch) ? 1 : hm.get(ch) + 1);
	}
	//hm.keySet()  代表所有键集合
	for (Character key : hm.keySet()) {
		//hm.get(key)  用过键来获取值
		System.out.println(key + " " + hm.get(key));	
	} 
}

//嵌套集合的遍历，2种方式
public static void main(String[] args) {
	HashMap<Student, String> hm8 = new HashMap<>();
	hm8.put(new Student("王五", 5), "深圳");
	hm8.put(new Student("张三", 23), "上海");
	hm8.put(new Student("李四", 2), "广州");
	hm8.put(new Student("张三", 123), "earth");
	HashMap<Student, String> hm9 = new HashMap<>();
	hm9.put(new Student("王1", 1), "深圳");
	hm9.put(new Student("张3", 3), "上海");
	hm9.put(new Student("李4", 4), "广州");
	hm9.put(new Student("张5", 5), "earth");
	HashMap<HashMap<Student,String>, String> hm2 = new HashMap<>();
	hm2.put(hm9, "第99期");
	hm2.put(hm8, "第88期");
	demo2(hm2);
	//demo1(hm2);
}

public static void demo1(HashMap<HashMap<Student, String>, String> hm2) {
	for(Entry<HashMap<Student, String>, String> en1 : hm2.entrySet()) {
		System.out.println(en1.getValue());
		for (Entry<Student,String> en2 : en1.getKey().entrySet()) {
			System.out.println(en2.getKey().getName() + " " + en2.getKey().getAge() + " " +en2.getValue() );
		}
	}
}

public static void demo2(HashMap<HashMap<Student, String>, String> hm2) {
	for(HashMap<Student, String> h : hm2.keySet()) {
		System.out.println(hm2.get(h));
		for (Student s : h.keySet()) {
			System.out.println(s.getName() + " " + s.getAge() + " " + h.get(s));
		}
	}
}
```
	

|共同点：底层都是哈希算法，都是双列集合|HashMap					|Hashtable						|
|-------------------------------|:-------------------------:|:-----------------------------:|
|区别							|是线程不安全的，效率高		|线程安全的，效率低				|
|								|可以存储null键和null值		|不能存储null键和null值			|
								
* Collections  工具类，全是静态方法，直接类名.调用
	* <T> void sort (List<T> list)   
		* 若是自定义类，必须实现Comparable接口才能使用
	* <T> int binarySearch(List<?> list,T key)		前提是list已经有序
	* <T> max (Collection<?> collection)
	* void reverse(List<?> list)
	* void shuffle(List<?> list)		洗牌

##异常
* 异常：java程序在运行过程中出现的错误
* 异常的继承体系
	* **Throwable （顶层）**
		* Error
		* Exception
			* RuntimeException
* main()函数遇到一个问题时，有2种处理方式：
	* 1. 自己将该问题处理，然后继续运行
	* 2. 自己没有针对的处理方式，只有交给调用main()的JVM来处理
		* JVM执行默认的异常处理机制：将该异常的名称、异常的信息、异常出现的位置带因在控制台上，同时将程序停止运行
* try	catch	finally
	* try ：用来检测异常
	* catch : 用来捕获异常
	* finall ：释放资源
* try catch
	* 当通过try  catch 将问题处理了，程序就会继续执行
	* try 后跟多个catch，小的异常往前放，大的异常往后放。
		* 如果大的放前面，就会将所有的子类对象接受，后面的catch就没有意义了

	```java

	// try后跟多个catch
	int a = 10;
		int b = 0;
		int[] arr = {1,2,4,5,6};
		try {
			System.out.println(a / b);
			/*System.out.println(arr[10]);
			arr = null;
			System.out.println(arr[0]);*/
			//  ArithmeticException  e = new ArithmeticException("/ by Zero")
		} catch (ArithmeticException e) {   

			System.out.println("出错了，除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组索引越界");
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
		} catch (Exception e) {
			System.out.println("出错了");
		}
		System.out.println("over");


	//JDK 7  处理多个异常
		int a = 10;
		int b = 0;
		int[] arr = {1,2,4,5,6};
		try {
			System.out.println(a /b );
			System.out.println(arr[10]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("出错了。。。");
		}
	```

* 异常分为2大类：
	* 编译时异常
		* 程序员必须显示处理，否则无法通过编译。（未雨绸缪异常）
	* 运行时异常
		* 所有的RuntimeException类及其子类的实例都成为运行时异常，其他的异常就是编译时异常
		* 程序员反对错误，需要回来修改
* Throwable的常用方法

	|方法名			|作用									|
	|---------------|:-------------------------------------:|
	|String  getMessage()	|获取异常信息					|
	|String  toString()     |获取异常类名和异常信息			|
	|void printStackTrace() |获取异常类名、异常信息、异常出现的位置|

* throw
	* 在功能方法内部出现某种情况，程序不能继续运行，需要进行跳转时，就用throw把异常对象抛出

* throws 的方式处理异常
	* 定义功能方法时，需要把出现的问题暴露出来让调用者去处理，就通过throws在方法上标识
	* 编译时异常的抛出必须对其进行处理
	* 运行时异常的抛出可以处理也可以不处理
	* 运行时异常在编译时不用处理，所以可以把不抛出
	* 在方法中抛出一个运行时异常时对象时，在方法上不用做异常声明
	* 但是，如果排除的是一个编译时异常，在方法上就必须做异常声明，否则报错


|区别			|throws					|throw				|
|---------------|:---------------------:|:-----------------:|
|出现			|在方法声明中			|方法体内			|
|后面			|跟一个或多个异常类名，用逗号隔开|跟一个异常对象|
|都表示抛出异常	|由该方法的调用者来处理|由方法体内的语句处理|

* finally
	* 被finally控制的语句一定会执行（哪怕之前有return也会先执行）
		* 特殊情况：在执行到finally之前JVM退出了（eg. System.exit(0) ）
	* finally的作用
		* 用于释放资源，在IO流操作和数据库操作中会见到

	|区别			|					  								 						|
	|---------------|:-------------------------------------------------------------------------:|
	|final 			|1.修饰类，该类不能被继承 2.修饰方法，该方法不能被重写 3.修饰变量，该变量只能复制一次|
	|finally 		|是try语句中的一个语句体|
	|finalize		|是一个方法。当垃圾回收器确定不存在该对象的更多引用时，有对象的垃圾回收器调用此方法|
					

* 自定义异常
	* 通过名字取反到底是什么异常，有针对的解决办法
	* 如果想让异常是运行时异常则继承RuntimeException
 	* 如果想让异常是编译时异常则继承Exception
 	* 自定义异常注意事项：
 		* 子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类。
 		* 如果父类抛出了多个异常，子类重写父类时，只能抛出相同的异常或者是它的子集，子类不能抛出父类没有的异常
 		* 如果被重写的方法没有异常抛出，那么子类的方法绝对不可以抛出异常。如果子类方法内有异常发生，那么子类只能try，不能throws
 	* 如何使用异常处理
 		* 原则：如果该功能内部可以将问题处理，用try，如果处理不了，则throws，交由调用者处理。
 		* 区别：
 			* 后续程序需要继续运行就try
 			* 后续程序不需要继续运行就throws
 		* 如果JDK没有提供对应的异常，就需要自定义异常

	```java
	public class Test1 {
		public static void main(String[] args) {
			Demo d = new Demo();
			System.out.println(d.get());		//	输出 30
		}
	}
	
	class Demo {
		int x = 10;
		public int get(){
			try {
				x = 20 ;
				System.out.println(1 / 0 );
				return x;
			} catch (Exception e) {
			/*
			 * try块中抛出异常后，被catch块接受，
			 * 执行  x = 30;
			 * 接下来时return，此时，return执行了，
			 * return建立出一个返回路径，相当于将x = 30 用返回路径撞到了一个箱子里
			 * 然后return判断后面是否有finally语句，
			 * 如果有finally语句，则去执行finally
			 * 虽然在finally中修改了x，但是返回路径中的x并没有改，
			 * 执行完finally之后，彻底返回 x = 30
			 */
				x = 30 ;
				return x;
			} finally {			
				x = 40;
			/*
			 * 千万不要再finally中写return，
			 * 因为finally是为了释放资源，是一定会执行的，
			 * 如果在这里面写return，那么try和catch里面的结果都会被改变
			 */
			//	return x;		
			}								
		}
	}

	//try  catch的嵌套
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数...");
		while (true) {
			String in = sc.nextLine();
			try {
				int num = Integer.parseInt(in);
				System.out.println(Integer.toBinaryString(num));
				break;
			} catch (Exception e) {
				try {
					new BigInteger(in);
					System.out.println("输入的整数过大，请输入一个小一点的整数：");
				} catch (Exception e1) {
					try {
						new BigDecimal(in);
						System.out.println("输入的是小数，请重新输入一个整数：");
					} catch (Exception e2) {
						System.out.println("请不要输入字符");
					}
				}
			}
			
		}
	}
	```

* File
	* File更应该叫做一个文件路径或目录（文件夹）路径
		* 路径
			* 绝对路径：从盘符开始，是一个固定的路径
			* 相对路径：相对于某个位置，在Eclipse下是指当前项目下，在DOS下是指当前路径
	* 构造方法：
		* File(String pathname)  根据一个路径得到File对象
		* File(String parent , String chile)  根据一个目录和一个子文件或目录得到File
		* File(File parent , String child)  根据一个父File对象和一个子文件或目录得到File对象
	* 创建功能————创建文件或文件夹时，如果不写盘符默认创建在项目路径下
		* public boolean createNewFile()   创建文件，如果存在这样的文件则不创建
		* public boolean mkdir()  创建文件夹（目录），如果存在这样的文件夹则不创建
		* public boolwan mkdirs()   创建文件夹，如果父文件夹不存在，则帮你创建
	* 重命名和删除功能
		* public boolean renameTo(File dest)   把文件重命名为指定的文件路径
			* 如果路径名相同，就是改名
			* 如果路径名不同，就是改名并剪切
		* public boolean delete()   删除文件或文件夹
			* java中的删除不走回收站
			* 要删除一个文件夹，要注意该文件夹内不能包含文件或文件夹（即只能删除空的文件夹）
	* 判断功能
		* public boolean isDirectory() 	判断是否是目录
		* public loolean isFile() 	判断是否是文件
		* public boolean exists() 	判断是否存在   
		* public boolean canRead() 	判断是否可读
		* public boolean canWrite() 	判断是否可写
		* public boolean isHidden() 	判断是否隐藏
	* 获取功能
		* public String getAbsolutePath() 	获取绝对路径
		* public String getPath() 	获取在构造方法中传入的路径（传相对返相对，传绝对返绝对）
		* public String getName() 	获取名称
		* public long length() 		获取长度（字节数）	
		* public long lastModified() 获取最后一次的修改时间（毫秒值）
		* public String[ ] list() 	获取指定目录下的所有文件或文件夹的名称数组
		* public File[ ] listFiles() 获取指定们目录下的所有问价或文件夹的File数组
		* public 

	```java
 	//将	路径+文件名	或	 路径+文件夹名		封装成File对象
	File f3 = new File("balabala.txt");		//相对路径
	File f1 = new File("G:\\sublime workspace\\java笔记.md");		//绝对路径
	System.out.println(f1.exists());


	
	//将父路径封装成File对象后能条用更多的操作
	String parent = "G:\\sublime workspace\\html-trial";
	String child1 = "eye.jpg";
	File file = new File(parent, child1);

	File file = new File("G:\\sublime workspace\\html-trial");
	String child = "eye.jpg";
	File f = new File(file,child);

	//创建单级文件夹
	File dir1 = new File("aaa");
	System.out.println(dir1.mkdir());

	//创建多级目录
	File ddir1 = new File("a\\b");

	File f1 = new File("G:\\Sublime Workspace\\html-trial"); 
	String[] arr = f1.list();		//只是文件名
	for (String string : arr) {
		System.out.println(string);
	}
	System.out.println("------------------");
	File[] farr = f1.listFiles();	//获取的是File对象数组
	for (File file : farr) {
		System.out.println(file);	//打印出来的是绝对路径
	}

	File yuan = new File("yuan.txt");
	System.out.println(yuan.length()); 	//返回文件大小（多少字节）
	long time = yuan.lastModified();	//文件的最后修改时间
	System.out.println(time);
	//根据毫秒值显示时间，用Date
	Date d = new Date(time);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
	System.out.println(sdf.format(d));


	//使用过滤器
	Public static void main(String[] args) {
		File dir2 = new File("E:\\");
								//匿名内部类，实现接口
		String[] filename = dir2.list(new FilenameFilter() {
			@Override
			/*
			 * list底层把dir2传入dir 
			 */
			public boolean accept(File dir, String name) {
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith("jpg");
			}
		});
		for (String string : filename) {
			System.out.println(string );
		}
	}
	```

##IO流
* 概念
	* IO流————处理设别之间的数据传输
	* Java对数据的操作是通过流的方式
	* Java用于操作流的类都在IO包中
	* 流的分类
		* 按流向分
			* 输入流、输出流
		* 按操作类型分
			* 字节流 ：字节流可以操作任何数据（计算机中任何数据都是以字节的形式存储的
			* 字符流 ：字符流只能操作纯字符数据，比较方便
	* IO流常用父类

		|字节流的抽象父类|字符流的抽象父类|
		|----------------|:--------------:|
		|InputStream	 |Reader		  |
		|OutputStream	 |Writer		  |

	* IO程序书写
		* 使用前，导包
		* 使用时，进行异常处理
		* 使用后，释放资源
* FileInputStream
	* read() 读取的是一个字节，为什么返回的是int，而不是byte
		* 因为字节输入流可以操作任意类型的文件，例如图片音频等，这些文件底层都是以二进制形式存储的，如果每次读取都返回byte，有可能在读到中间的时候遇到11111111（8个1），那么这11111111（8个1）是byte类型的-1，程序一旦遇到-1 就停止不读了，后面的数据就读不到了，所以在读取的时候用int 类型接受（把每一个byte型的高位用0补充），如果遇到11111111（8个1），会在其前面不上24个0凑足4个字节，那么byte类型的-1就变成int类型的255了，这样可以保证整个数据读完，而结束表标记的-1就是int型的
* FileOutputStream
	 * 在创建对象时，如果没有则自动创建，如果有，则先将这个文件清空.如果想在已有文件中续写，则在第二个参数处写true
	```java
	 如果out已存在，则先将其清空，再写入新数据
	FileOutputStream out = new FileOutputStream("Java.txt");
		//往里面写数据
	out.write(97);	//虽然写出的是int，但到文件上就是一个字节，会自动去掉前面的24个0
	
							   //想续写，则在第二个参数处写true
	FileOutputStream out = new FileOutputStream("java.txt",true);
		out.write(99);
	```

	```java
	==========================copy====================================
	方法1.一次一个字节
	缺点：效率低
	public static void copy() throws FileNotFoundException, IOException {
		//创建输入流对象，关联源文件
		FileInputStream in = new FileInputStream("yard.jpg");
		//创建输出流对象，关联目标文件
		FileOutputStream out = new FileOutputStream("copy_yard.jpg");
		int commute;
		while ((commute = in.read()) != -1) {	//不断的读取每一个字节
			out.write(commute);			//不断的写每一个字节
		}
		//释放资源
		in.close();
		out.close();
	}

	方法2.现将源文件全部放入byte[] 中，然后在将byte[] 中的内容全部放入目标文件中
	缺点：有可能内存溢出
	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream("yard.jpg");
		FileOutputStream out = new FileOutputStream("copy_yard.jpg");
		byte[] arr = new byte[in.available()];	//创建与文件大小一样的
		in.read(arr);							//将文件上的字节全部读到内存里
		out.write(arr);							//将字节数组中的字节数据写到文件中
		in.close();
		out.close();
	}

	方法3.定义一个小数组（相当于定义一个缓存）===========推荐使用============
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("yard.jpg");
		FileOutputStream out = new FileOutputStream("copy_yard.jpg");
		int length;
		//相当于定义一个Cache
		//数组长度通常为1024 的整数倍
		byte[] arr = new byte[1024 * 10];
		//如果在in.read()中忘记加arr，返回到就不读取的字节个数，而是字节的码表值
		while((length = in.read(arr)) != -1) {		
			out.write(arr,0,length);
		}
		in.close();
		out.close();
	}

	方法4.使用缓冲区对象   ===========推荐使用============
	public static void demo1() throws FileNotFoundException, IOException {
		//创建输入流对象
		FileInputStream in = new FileInputStream("yard.jpg");
		//创建输出流对象
		FileOutputStream out = new FileOutputStream("copy_yard.jpg");
		//包装
		//创建缓冲区对象，对输入流进行包装使其变得更加强大
		BufferedInputStream bin = new BufferedInputStream(in);
		//创建缓冲区对象，对的输出流进行包装使其变得更加强大
		BufferedOutputStream bout = new BufferedOutputStream(out);
		int commute;
		/*
		 * 原理：从硬盘一次性取出8kB的内容放入内存的输入流缓冲区，
		 * 然后一次一个字节的往同样在内存的输出流缓冲区传送，
		 * 当全部传完后，输出流缓冲区一次性将全部内容写到硬盘，
		 * 然后循环这个过程
		 */
		while((commute = bin.read()) != -1) {
			bout.write(commute);
		}
		//关闭资源
		bin.close();
		bout.close();
	}
	```

	|** 		|flush()  和close() 的区别						|
	|-----------|:---------------------------------------------:|
	|flush()	|用来刷新缓冲区。刷洗后可以继续写				|
	|close()	|用来关闭流释放资源。如果是带缓冲区的流对象的close(),在关闭流之前会刷新缓冲区，关闭后不能再写|


	```java
	//字节流写字符串
	FileOutputStream out = new FileOutputStream("a.txt");
	out.write("hello world 你好世界".getBytes());
	//输入回车换行
	out.write("\r\n".getBytes());

	```

	```java
		//JDK 6   IO流的标准异常处理
		public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("yard.jpg");
			out = new FileOutputStream("copy_yard.jpg");
			int b;
			while((b = in.read()) != -1) {
				out.write(b);
			} 			
		} finally {
			//try finally 嵌套的目的：能关一个就关一个
			try {
				if (in != null)
					in.close();
			} finally {
				if (out != null)
					out.close();
			}
		}
	}


	// JDK 1.7 IO流标准异常处理
	public static void main(String[] args) throws IOException {
		try (
			FileInputStream in = new FileInputStream("yard.jpg");
			FileOutputStream out = new FileOutputStream("copy_yard.jpg");
		){
			//执行完次花括号里的代码后，会自动调用上面小括号中流对象的close()进行关闭
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			System.out.println("先执行");
		}
	}

	public static void main(String[] args) throws IOException {
		//图片简单加密
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("copy_yard.jpg"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("jiemi_yard.jpg"));
		int b;
		while ((b = in.read()) != -1) {
			//将写出的字节异或一个数，这个数就是秘钥，解密时再次异或就可以了
			out.write(b ^ 90);
		}
		in.close();
		out.close();
	}
	```
* FileReader
	
	```java
	=====================复制字符文件==========================
	方法1.
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("zzz.txt");
		int b;
		while ((b = fr.read()) != -1) {
			fw.write(b);
		}
		fr.close();
		//Writer 类中有一个2K的缓冲区，如果不关闭，那么最后一的内容将停留在缓冲区中
		//若关流，则会将缓冲区中的内容刷新到硬盘中，最后关闭流。
		fw.close();
	}

	方法2.自定义一个小数组
	public static void main(String[] args) throws IOException {
		//自定义数组缓冲区
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("zzz.txt");
		char[] arr = new char[1024 * 2];
		int length ;
		//将文件中的数据读取到char数组中
		while ((length = fr.read(arr)) != -1) {
			//将char数组中的数据写到文件上
			fw.write(arr,0,length);
		}
		fr.close();
		fw.close();
	}

	方法3.带缓冲区的字符流
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("zzz.txt"));
		int c;
		while ((c = br.read()) != -1) {
			bw.write(c);
		}
		br.close();
		bw.close();
		System.out.println("end");
	}


		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("zzz.txt"));
		String in;
		//readline() 一次读取一行，返回的String 中没有换行符，需要手动换行
		while((in = br.readLine()) != null) {
			bw.write(in);
			/*
			 * newLine() 和 "\r\n"的区别
			 * newLIne() 是跨平台的方法
			 * "\r\n"只适用于Windows
			 */
			bw.newLine();		//换行
		  //bw.write("\r\n");   //换行 
		}
		br.close();
		bw.close();


	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("xxx.txt"));
		String tem;
		lnr.setLineNumber(100);
		//readLine()中有一句LineNumber++;
		//即没执行一次readLine() 行号加1，所以当设置行号为100是，显示的起始值为101
		while ((tem = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + "  " + tem);
		}
		lnr.close();
	}
	```
* 装饰设计模式的有点：
	* 耦合性不强，被装饰的类的变化与装饰类的变化无关
	* 3个步骤
		* 1.获取被装饰类的引用
		* 2.在构造方法中传入被装饰类的对象
		* 3.对原有功能进行升级
	```java
	public class Demo6_Wrap {

		public static void main(String[] args) {
			EnhancedStudent ens = new EnhancedStudent(new Student());
			ens.code();
		}

	}


	//共同实现的接口
	interface Coder {
		public void code();
	}

	class Student implements Coder {
		@Override
		public void code() {
			System.out.println("javaSE");
			System.out.println("javaWeb");
		}
	}

	class EnhancedStudent implements Coder {
		//1.获取被装饰类的引用
		private Student s;
		//2.在构造方法中传入被装饰类的对象
		public EnhancedStudent(Student s) {
			this.s = s;
		}
		//3.对原有的功能进行升级
		@Override
		public void code() {
			s.code();
			System.out.println("database");
			System.out.println("SSH");
			System.out.println("bigDate");
			System.out.println("...");
		}
		
	}
	```
* 指定码表读写字符
	* InputStreamReader————指定码表读字符
	* OutputStreamWriter————指定码表写字符

	```java
	public static void main(String[] args) throws IOException {
		//指定码表读字符
		InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8.txt"),"utf-8");
		//指定码表写字符
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk");
		int c ;
		while ((c = isr.read()) != -1) {
			osw.write(c);
		}
		isr.close();
		osw.close();
	}
	
	
	//把字符流包装
	public static void main(String[] args) throws IOException {
		BufferedReader br = 		//更高效的写
				new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8"));
		BufferedWriter bw = 		//更高效的读
				new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk"));
		int b;
		while ((b = br.read()) != -1) {
			bw.write(b);
		}
		br.close();
		bw.close();
		System.out.println("end");
	}

	//软件限次
	public static void main(String[] args) throws IOException {
		//使用BufferedReader是为了使用期readline()读取一整行，从而保持数据的原样性
		BufferedReader br = new BufferedReader(new FileReader("record.txt"));
		String c = br.readLine();	//读取整行
		br.close();
		int num = Integer.parseInt(c);		//String ---> int 
		if (num > 0) {
			System.out.println("欢迎使用本软件，您还有" + num-- + "次机会");
			//new FileWriter时，因为recort.txt已经存在，
			//所以会先将其清空，再写内容，
			//所以不能在BufferedReader将数据读取到之前new
			FileWriter fw = new FileWriter("record.txt");
			fw.write(num + "");
			/*
			 * 如果没有关闭输出流，那么将导致无法将数据写会去
			 * FileWriter内部有一个小的缓冲区，在执行close()时，
			 * 会先将缓冲区中的数据刷回硬盘然后关闭流 
			 */
			fw.close();
		} else {
			System.out.println("请购买正版软件");
		} 
		System.out.println("end");
		
		
	}

	```
* 递归
	* 有点：不用知道循环次数
	* 弊端：不能调用次数过多，容易导致占内存溢出
	* 构造方法不能使用递归调用
	* 递归方法不一定要有返回值
* SequenceInputStream
	* 将多个输入流整合为一个流
	```java
	//将2个输入流整合为一个流
	FileInputStream fis1 = new FileInputStream("a.txt");
	FileInputStream fis2 = new FileInputStream("b.txt");
	SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

	public static void main(String[] args) throws IOException {
		// 将多个流整合成一个流
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		//床架集合
		Vector<FileInputStream> v = new Vector<>();
		//将流对象存入集合
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		Enumeration<FileInputStream> en = v.elements();
		//将枚举中的输入流整合成一个
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fos = new FileOutputStream("d.txt");
		int b;
		while ((b = sis.read()) != -1) {
			fos.write(b);
		}
		sis.close();
		fos.close();
		System.out.println("end");
	}
	```

* 内存输出流————ByteArrayOutputStream
	* 内存输出流可以向内存中写数据，把内存当做一个缓冲区，写出之后可以一次性获取所有数据

	```java
	public static void main(String[] args) throws IOException {
		//创建输入流
		FileInputStream fis = new FileInputStream("a.txt");
		//创建内存输入流
		//在内存中创建可以增长的内存数组。因为是放入内存所以是空参的构造
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//将输入流的数据存入内存的缓冲区
		int b;
		while ((b = fis.read()) != - 1) {		//将读取到的数据逐个写到内存数组中
			baos.write(b);
		}
		fis.close(); 
		
		//一次性获取内存数组中的所有数据
	/*	//当涉及到码表转换的时候使用该方式，即在转换时可以自己指定码表
	 * byte[] arr = baos.toByteArray();
		String line = new String(arr);*/
		
		//使用平台默认的码表，将缓冲区的内容转换为字符串
		String str = baos.toString();
		//也可以省略toString(),因为打印对象时，会自动调用该对象的toString()
		
		
		System.out.println(str);
	}
	```

* FileInputStream 读取中文的时候出现了乱码的解决方案
	* 字符流读取
	* ByteArrayOutputStream

	```java
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		ByteArrayOutputStream baso = new ByteArrayOutputStream();
		byte[] arr = new byte[5];
		int len;
		while ((len = fis.read(arr)) != -1) {
			baso.write(arr,0,len);
		}
		fis.close();
		System.out.println(baso.toString());
	}
	```

* ObjectOutputStream 
	* 对象输出流。序列化：将对象写到文加上
		* 必须实现Serializable接口才能实现序列化
	* 写到文件中的数据不一定要看懂，只要能反序列化就行
* ObjectInputStream
	* 对象输入流。反序列化

	```java
	public static void writeToArrayList() throws IOException, FileNotFoundException {
		Person p1 = new Person("tony",23);
		Person p2 = new Person("jery",24);
		Person p3 = new Person("harry",12);
		Person p4 = new Person("port",34);
		将多个对象放入集合
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		//开始序列化
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d.txt"));
		//将整个集合一次写出
		oos.writeObject(list);
		//序列化结束
		oos.close();
		
		//开始反序列化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d.txt"));
		//将整个集合一次性读出
		ArrayList<Person> list = (ArrayList<Person>)ois.readObject();
		//遍历集合的得到每个对象
		for (Person p : list) {
			System.out.println(p);
		}
		//反序列化结束
	}
	```

* PrintStream   打印字节流
	* 可以很方便的将对象的toString()结果输出，并且自动加上换行，而且可以使用自动刷出的模式
	* System.out 就是一个PrintStream,其默认向控制台输出信息
	* 只操作数据目的
* PrintWriter	打印字符流
	* 只操作数据目的

	```java
		PrintStream ps = System.out;	//获取标准输出流
		ps.println(98);		//底层通过Integer.toString()将其转为String并打印
		ps.write(98);			//查码表后进行翻译再打印
		
		Person p = new Person("hello",23);
		ps.println(p);		//默认调用对象的toString() 
		Person p2 = null;
		ps.println(p2);	//打印引用数据类型时，如果是null，则打印null，如果不是null，则调用对象的toString()
		ps.close();

		PrintWriter pw = new PrintWriter(new FileOutputStream("b.txt"),true);
		pw.print(98);
		pw.println(97);		//自动刷出功能只针对println(...)
		pw.write(97);
		pw.close();
	```
* 标准输入输出流
	* System.in 是InputStream，标准输入流，默认可以从键盘输入读取字节数据
	* System.out 是PrintStream，标准输出流，默认可以向Console中输出字符和字节数据


	```java
		InputStream is = System.in;
		int x = is.read();
		System.out.println(x);
		is.close();						//此处的流不用关，因为没有和哪个文件进行关联。
		InputStream is2 = System.in;		//这个输入流只有一个，即使新创建也和之前那个是同一个
		int q = is2.read();
		System.out.println(q);


	```

//改变流
	System.setIn(new FileInputStream("a.txt"));		//改变标准输入流
	System.setOut(new PrintStream("b.txt"));		//改变标准输出流
	//获取流
	InputStream is = System.in;			//获取标准输入流，默认指向键盘，改变后指向文件
	PrintStream ps = System.out;		//获取标准输出流，默认指向控制台，改变后指向文件
	//开始复制
	int b;
	while ((b = is.read()) != -1) {
		ps.write(b);
	}
	```

* 2中方式实现键盘录入
	```java
	//System.in为字节流，InputStreamReader为转换流，BufferedReader为字符流
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line = br.readLine();		//读取一整行
	System.out.println(line);
	br.close();
	
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();			//读取一整行
	System.out.println(str);
	```

* 数据输入输出流

	```java
	FileOutputStream fos = new FileOutputStream("b.txt");
	fos.write(997);
	fos.write(998);
	fos.write(999);
	fos.close();
		997			1111100101
		因为write一次写一个字节，所以写进去的是后8位，前面的都被砍去，
		即写入的是11100101，转成十进制为229，
	FileInputStream fis = new FileInputStream("b.txt");
	System.out.println(fis.read());		//229
	System.out.println(fis.read());		//230
	System.out.println(fis.read());		//231
	

	DataOutputStream dos = new DataOutputStream(new FileOutputStream("b.txt"));
	dos.writeInt(997);
	dos.writeInt(998);
	dos.writeInt(999);
	//写出后的文件看不懂，但能读出即可
	dos.close();

	DataInputStream dis = new DataInputStream(new FileInputStream("b.txt"));
	System.out.println(dis.readInt());
	System.out.println(dis.readInt());
	System.out.println(dis.readInt());
	dis.close();

	```
* Properties
	* Properties 类表示了一个持久的属性集
	* Properties 可保存在流中或从流中加载
	* 属性列表中每个键及其对应值都是一个字符串
	* 是一个双列集合但没有泛型

```java

	public class 将一个文件夹（及其内容）复制到另一个文件夹中 {
		public static void main(String[] args) throws IOException {
			System.out.println("请输入1个文件夹路径");
			File src = getDir();
			System.out.println("请输入1个文件夹路径");
			File dest = getDir();
			if (src.equals(dest)) {		//防止无限循环创建
				System.out.println("2个路径不能相同，请重新输入");
			} else {
				copy(src,dest);
			}
			System.out.println("end");
		}
		
		private static File getDir() {
			Scanner sc = new Scanner(System.in);
			while (true) {
				String line = sc.nextLine();
				File file = new File(line);
				if (!file.exists()) {
					System.out.println("您输入的路径不存在，请重新输入");
				} else if (file.isFile()) {
					System.out.println("您输入的是文件路径，请输入文件夹路径");
				} else {
					return file;
				}
			}
		}
		
		private static void copy(File src,File dest) throws IOException {
			File root = new File(dest,src.getName());		//创建新路径
			root.mkdir();		//创建新文件夹 
			File[] arr = src.listFiles();
			for (File file : arr) {
				if (file.isFile()) {
					//复制的时候只能用字节流。因为字符流只能复制文本
					BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
					//用File对象给出新的路径																	
					BufferedOutputStream bos =
							new BufferedOutputStream(new FileOutputStream(new File(root,file.getName())));
					int b;
					while ((b = bis.read()) != -1) {
						bos.write(b);
					}
					bis.close();
					bos.close();
				} else {
					copy(file, root);
				}
			}
		}
	}


	public class 层级打印文件夹中的所有文件 {
	public static void main(String[] args) {
			System.out.println("请输入一个文件夹路径");
			File file = getDir();
			print(file,0);
			System.out.println("end");
		}
		
		private static File getDir() {
			Scanner sc = new Scanner(System.in);
			File file = new File(sc.nextLine());
			while (true) {
				if (!file.exists()) {
					System.out.println("您输入的路径不存在，请重新输入");
				} else if (file.isFile()) {
					System.out.println("您输入的是文件路径，请输入文件夹路径");
				} else {
					return file;
				}
			}
		}
		
		private static void print(File file,int lev) {
			File[] arr = file.listFiles();
			for (File f : arr) {
				for (int i = 0 ; i < lev ; i++) {
					System.out.print("\t");
				}
				System.out.println(f.getName());
				if (f.isDirectory()){
					print(f,lev + 1);
				}
			}
		}
	}


```

##线程
* Java程序运行原理
	* java命令会启动JVM，等于穷的了一个应用程序，也就是启动了一个进程，该进程会自动启动一个“主线程”，然后主线程去调用某个类的main()
* JVM是多线程的。因为JVM启动至少启动了垃圾回收线程和主线程

	```java
	//开启线程的第一种方法
	public class Demo1_Thread {

		public static void main(String[] args) {
			My my = new My();		//4.创建Thread的子类对象
			my.start();				//5.调用strar()开启线程
			for( int i = 0 ; i < 10000 ;i++) {
				System.out.println("main()....");
			}
		}

	}

	class My extends Thread {		//1.继承Thread
		public void run(){			//2.重写run()
			for (int i = 0 ; i < 10000 ; i++){		//3.将要执行的代码卸载run()中
				System.out.println("class My ...");
			}
		}
	}

	//开启线程的第二种方法
	public class Demo2_Thread {
		public static void main(String[] args) {
			MyThread m = new MyThread();		//4.创建Runnable的子类对象
			Thread t = new Thread(m);			//5.将其当做参数传入Thread的构造函数
			t.start();							//6.开启线程
			for (int i = 0 ; i < 10000 ; i++) {
				System.out.println("main()....");
			}
		}

	}

	class MyThread implements Runnable {		//1.定义一个类实现Runnable接口
		@Override
		public void run() {						//2.重写run()
			for (int i = 0 ; i < 10000 ; i++) { //3.将要执行的代码卸载run()中
				System.out.println("MyThread....");
			}
		}
		
	}

 
	public static void main(String[] args) {
		//1.匿名内部类继承Thread
		new Thread() {		//1.继承Thread
			public void run() {		//2.重写run()
				for (int i = 0 ; i < 1000 ; i++) {		//3.将要执行的代码写在run()中
					System.out.println("匿名内部类");
				}
			}
		}.start();		//4.开启线程
		
		//2.匿名内部类实现接口
		new Thread(new Runnable() {		//1.将Runnable的匿名对象传给Thread的构造函数
			public void run() {			//2.重写run()
				for(int i = 0 ; i < 1000; i++) {		//3.将要执行的代码写在run()中
					System.out.println("实现接口");
				}
			}
		}).start();		//4.开启线程
	}
	```

	
	|**			|两种方式的区别(查看源码的区别)															|
	|-----------|:---------------------------------------------------------------------:|
	|继承Thread	|由于子类重写了Thread 类的run(),当调用start()时，JVM直接找子类的run()方法  |
	|实现Runnable接口|构造函数中传入了Runnable的引用，成员变量记住了它，start()调用run()方法时内部判断成员变量Runnable的引用是否为null，不为null时，编译时看的是Runnable的run()，运行时执行的是子类的run()方法|

	|**				|优点										|缺点										|
	|---------------|:-----------------------------------------:|:-----------------------------------------:|
	|继承Thread		|可以直接使用Thread类中的方法。**代码简单**		|如果已经有了父类，则不能使用该方法			|
	|实现Runnable接口|即使有父类也没关系。**扩展性好**				|不能直接使用Thread中的方法，需要先获取到线程对象后，才能得到Thread的方法，代码复杂|

* 线程的名字
	* String getName()
	* void setName(String)
* 获取当前线程对象，主线程也可以获取
	* 静态方法,直接类名 . 调用     
		* Thread.currentThread()
* 休眠线程
	* 静态方法   Thread.sleep(毫秒)
	* 控制当前线程休眠若干毫秒
* 守护线程
	* setDaemon(boolean b)
	* 设置一个线程为守护线程，该线程不会单独执行，当其他非守护线程都执行结束后，自动退出。不是立即退出，有一个时间缓冲
* 礼让线程（让出CPU）
	* 静态方法  Thread.yield
* 设置优先级
	* setPriority(int i)
	* 共10个等级，1~10,1最小，10最大。
	* 1--->Thread.MIN_PRIORITY
	* 10--->Thread.MAX_PRIORITY
* 同步
	* 当多个线程并发，有多段代码同时执行时，我们希望某一段代码执行的过程中CPU不要切换到其他线程工作，这时就需要同步
	* 如果两段代码是同步的，那么同一时间只能至此那个一段，在一段代码没执行结束之前，不会执行另外一段代码
* 同步代码块
	* 使用synchronized关键字加上一个锁对象（任意对象都可作为锁对象）来定义一段代码，这就叫同步代码块
	* 多个同步代码块如果使用相同的锁对象，那么他们就是同步的
* 非静态的同步方法的锁对象是————**this**
* 静态的同步方法的锁对象是————**字节码对象，即：  类名.class**


	```java
	public class Demo2_Synchronized {
		public static void main(String[] args) {
			final Printer2 p = new Printer2();
			new Thread() {
				public void run() {
					// 匿名内部类使用方法内的局部变量必须用final修饰
					while (true) {
						p.print1();
					}
				}
			}.start();
			new Thread() {
				public void run() {
					while (true) {
						p.print2();
					}
				}
			}.start();
		}
	}
	/*
	 * 非静态的同步方法锁是————this
	 * 静态的同步方法锁是————字节码文件,即： 类名.class
	 */
	class Printer2 {
	//	public synchronized void print1() {		//非静态同步方法————this
		public static synchronized void print1() {		|		//静态同步方法————Printer2.class
			System.out.print("中");                     |           |        
			System.out.print("央");                     |           |       
			System.out.print("电");                     |           |                         
			System.out.print("播");                     |           |             
			System.out.print("台");                     |           |                     
			System.out.println();                       |           |                     
		}                                               |           |                 
                                                        |           |                    
		public void print2() {                          |           |            
	//		synchronized (this) {     <-----------------╯          |                       
			synchronized (Printer2.class) {        <----------------╯             
				System.out.print("湖");
				System.out.print("南");
				System.out.print("卫");
				System.out.print("视");
				System.out.println();
			}
		}
	}
	```