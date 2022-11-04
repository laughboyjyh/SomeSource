# Anylogic

# 一. 简介

​		AnyLogic，是一款应用广泛的，对离散、系统动力学、多智能体和混合系统建模和仿真的工具。

​		AnyLogic是一款独创的仿真软件，它以最新的复杂系统设计方法论为基础，是第一个将UML语言引入模型仿真领域的工具，也是唯一支持混合状态机这种能有效描述离散和连续行为的语言的商业化软件。

​		AnyLogic独特的核心技术和领先的用户接口使其成为设计大型复杂系统的理想工具，因为构建物理原型进行试验代价高昂，耗时太长，有时还不一定成功。

# 二.特色

1. 仿真模拟的优点:


-  01 无风险环境

- 02 节省时间和金钱
- 03 可视化
- 04 对动力学的洞察力
- 05 提高准确性
- 06 处理不确定性

1. 建模方法的使用:Anylogic使用了所有现代仿真方法开发模型


-  离散事件

   以过程为中心。

- 基于代理
  基于代理的建模专注于系统的各个活动组件。
- 系统动态
  更抽象。

# 三.主要功能

#### 1.最强大最灵活的仿真建模技术:

AnyLogic为您提供了远胜其他任何工具的建模结构，用于结构，行为，和系统数据的描述。对象，接口和等级层次，块图和流图，计时器，端口和消息传递，变量和代数一微分方程，以及在模型中任何地方插入JavaTM语言表达式，语句，或函数，等等这些构成了任何层次，任何专业的建模者都可以使用的终级工具箱。

#### 2.开放式体系结构

AnyLogic模型具有开放式的体系结构，因而可以与任何办公或企业软件及用JavaTM语言或其他语言(通过JNI)编写的自定义模块协同工作。模型可以动态地对电子表格，数据库，ERP或CRM系统进行数据读写，或嵌入到实时运行环境中。可以在模型中任何地方调用外部程序，反之亦然;可以借助AnyLogic仿真引擎的开放API从任何外部程序中调用仿真模型。在 AnyLogic中你也可以使用自定义的随机数发生器，数值方法或优化算法等。

#### 3.分析

在AnyLogic中，你可以创建随机性或确定性的模型，并对模型的输出数据进行分析。AnyLogic支持超过35种随机分布，也允许自定义分布。你可以使用Stat::Fit随机分布拟合软件对历史数据进行分析，并创建AnyLogic可用的解析分布。AnyLogic中包含了数据采集与统计分析的工具，以及强大的数据展示框架。用户可以根据实际情况进行蒙特卡罗试验，敏感性分析，优化，以及自定义的试验等。

#### 4.优化

在AnyLogic中无缝地集成了世界领先的OptQuestTM优化器。OptQuestTM使用启发式方法，神经网络和数学优化方法，找到使目标函数值最大或最小的离散和/或连续模型参数的值。OptQuestTM已经表现出它是一种在处理最具挑战性的非线性模型方面极为有效的优化方法。它能够根据约束条件和不确定性给出最优解。OptQuestTM在模型开发环境中进行设置和运行。

#### 5.可交互的二维和三维动画

AnyLogicTM拥有十分灵活的动画框架。你可以创建具有任意可想象的复杂度的可交互动画，只需在AnyLoqicTM动画编辑器中绘制和导入图形，并将其与模型对象相关联起来（库对象具有预定义的动画)。与模型一样，它的动画也具有可缩放的动态等级结构。在一个动画中可以包含多个视图，或多个细节层次。一套丰富的可用控件（按钮，滑块，编辑框等）以及各种业务图形元素（柱状图，点线图，Gantt图等)，帮助你将仿真模型转化为一个适合决策者的图板。支持二维和三维动画。

#### 6.灵巧的可于网络上运行的模型

只要 AnyLogicTM模型（包括仿真引擎和动画）是100%的JavaTM程序，它们就可以运行在任何可以使用JavaTM的平台上（例如Windows，Solaris，Linux，MacOS 等)，甚至可以被当作Java小程序而放在网站上。这一独特的能力可以让远端的客户能够直接通过网络浏览器运行全功能的可交互模型，而不需要安装任何运行用或观察用版本。这是与其他人交流你的模型的最好的方法。



# 四.用途

​		AnyLogic是一款强大的模拟仿真软件,它的应用领域包括：物流、供应链、制造生产业、行人交通仿真、行人疏散、城市规划建筑设计、Petri网、城市发展及生态环境、经济学、业务流程、服务系统、应急管理、GIS信息、公共政策、港口机场、疾病扩散、国防等。

## 案例介绍:基于代理的防空系统模型

​		轰炸机被派去摧毁紧挨着在某个地区内的地面设施。每栋建筑发射一架飞机。飞机携带炸弹。为了成功完成任务，飞机需要向建筑物投掷炸弹。完成任务后，轰炸机使用更高高度的路线返回基地。轰炸机速度为600千米/小时。

​		这些建筑物受到防空系统的保护，该系统由两个配备制导地对空导弹的雷达组成。一个雷达可以同时引导多达两枚导弹。一旦轰炸机进入雷达的覆盖区域，就会发射导弹。导弹速度为900千米/小时。导弹一旦靠近飞机就会爆炸。如果导弹在击中飞机之前离开雷达覆盖区域，它就会自我毁灭。

### 第1阶段:创建资产(建筑物)

#### 步骤1. 新建模型

- 创建新模型,单击新建工具类按钮,显示"新建模型"对话框,填入模型名和要保存的位置,模型时间单位设定为秒,单击完成结束创建

![](E:\Anylogicprofessional\models\airdefensesystemimage\airdefense1.png)



- 创建新的代理群体,将代理元素从选项板拖到右侧main图中,打开"新建代理"对话框,选择智能体群

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\airdefense4.png)

- 将Building填入字段名称中,作为建筑名,单击下一步执行

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\airdefense3.png)



- 将选择动画参数选为3D,在buildings中选择House类型,进行下一步

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\airdefense5.png)

  

- 不选择参数.直接进入下一步

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\airdefense6.png)

- 创建具有10个智能体的群,进行下一步

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\airdefense7.png)

- 将"空间类型"参数保留为"连续",选择"应用随机布局"选项,单击完成结束创建

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\airdefense8.png)

- 查看新创建的代理,以及动画形状

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\airdefense9.png)

#### 步骤2.调整模型比例

- 单击打开main图查看标尺属性

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\airdefense10.png)

- 设置"标尺长度对应于"参数为100,刻度也随之变化

![](E:\Anylogicprofessional\models\airdefensesystemimage\airfense11.png)

#### 步骤3.模型运行

- 单击运行按钮,模型自动启动,10个建筑物随机分布在500*500像素的空间中

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\airdefense12.png)

#### 步骤4.添加3D窗口

- 将3D窗口元素从调色板拖到图形编辑器,将窗口放在模型框下方

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\defense21.png)

- 添加3D属性视图,"高度","宽度"参数设置为1000和600。

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\defense22.png)

#### 步骤5.查看3D视图

- 单击运行按钮,模型自动启动,切换开发面板,选择3D视图

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\denfense23.png)

#### 步骤6.绘制曲面

- 将矩形形状从“演示文稿”调色板拖到 Main界面，将其左上角放在 （0，0）处

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\denfense24.png)

- 矩形属性“位置和大小”部分，并将其“宽度”和“高度”参数设置为1000和600,线条颜色"无色",纹理设置为"地球纹理",选择“锁定”选项以锁定形状

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\denfense25.png)

- 点击运行查看视图

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\defense27.png)

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\denfense26.png)

#### 步骤7.定义受保护区域

- 双击“流程建模库”选项板中的“多边形节点”元素以激活绘图模式

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\denfense28.png)



- 在main界面中绘制保护区域,双击最后一个节点结束绘制

![](E:\Anylogicprofessional\models\airdefensesystemimage\denfense31.png)

- 导航到属性中设置名字为"protectedArea"被保护区域.可见参数设置为"否"

![](E:\Anylogicprofessional\models\airdefensesystemimage\denfense32.png)

#### 步骤8.重新安置设施

- 点击buildings打开"属性"视图,找到“初始位置”部分，并将“放置代理”参数设置为 在节点中。节点参数选择"protectedArea"

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\denfense29.png)

- 单击main,打开"属性"视图,找到到“空间和网络”部分,将“布局类型”设置为“用户定义”

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\denfense30.png)

- 运行模型.建筑物将位于多边形节点区域内,表示建筑在受保护区域中

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\denfense33.png)

### 第2阶段:创建轰炸机

#### 步骤1. 新建代理模型bombers

- 将代理元素从“代理”选项板拖到 主要图。将其放置在模型动画左侧的建筑物群附近。

![](E:\Anylogicprofessional\models\airdefensesystemimage\b1.png)



- 选择创建新的代理群体

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b2.png)

- 将Bomber填入字段名称中,作为轰炸机名,单击下一步执行

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b3.png)



- 将选择动画参数选为3D,在军事中选择轰炸机类型,进行下一步

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b4.png)

  

- 点击添加新参数,设置参数名target,类型为其他,选择building作为轰炸机任务的目标建筑物.直接进入下一步

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b5.png)

- 创建初始为空的群,在模拟运行是添加代理,点击完成

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b6.png)

- 查看新创建的代理,以及动画形状

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b7.png)

#### 步骤2.定义初始位置

- 单击打开bombers图查看属性,并设置速度位600千米/小时,从100米高的初始地起飞

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b8.png)

- 设置"标尺长度对应于"参数为100,刻度也随之变化

![](E:\Anylogicprofessional\models\airdefensesystemimage\airfense11.png)

#### 步骤3.定义状态图的行为

- 双击bomber进入其关系图,切换到代理选项板的状态图部分

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b9.png)

- 将“状态图入口点”元素拖到 Bomber代理,双击state元素在图中绘制状态矩形,命名为ToTarget,连接两个元素,有绿点表示连接成功

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b10.png)

- 修改Totarget属性,加入运行Java代码

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b11.png)

- 将“变迁”元素拖到关系图上的“ToTarget”状态并连接它们。然后导航到其属性，并将“触发通过”参数设置为“智能体到达”

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b12.png)

- 将另一个状态元素拖到代理关系图中，并将其连接与过渡元素相连。命名Away.然后导航到其“属性”视图，并在“进入行动”字段中键入以下代码，这将使轰炸机在到达目标后返回到以前的高度。

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b13.png)

- 将另一个过渡元素拖到代理图中，并将其连接到 Away 元素。然后导航到其属性，并将“触发通过”参数设置为“智能体到达”。状态图上的两个过渡元素必须相同。

![](E:\Anylogicprofessional\models\airdefensesystemimage\b14.png)

- 最后，将“最终状态”元素拖到代理关系图中，并将其连接到上次添加的过渡元素上。然后导航到其“属性”视图，并在“输入操作”字段中键入以下代码，这将删除已完成此状态图所有步骤的轰炸机。

![](E:\Anylogicprofessional\models\airdefensesystemimage\b15.png)





#### 步骤4.程序任务分配

- 进入main关系图,将事件元素从“代理”选项板拖到 main图并将其放置在代理群体旁边。

![](E:\Anylogicprofessional\models\airdefensesystemimage\b16.png)

- 进入event属性,并重新命名为startMission(启动任务),模式参数改为"循环",复发时间改为秒,参数字段输入"uniform(5,12)",打开"行动"面板.输入代码实现创建新的轰炸机代理，并将建筑物分配给轰炸机作为目标

![](E:\Anylogicprofessional\models\airdefensesystemimage\b17.png)

运行模型来观察轰炸机的飞行直播![](E:\Anylogicprofessional\models\airdefensesystemimage\b18.png)

![](E:\Anylogicprofessional\models\airdefensesystemimage\b19.png)

#### 步骤5.绘制3D逃生路线

- 打开“空间标记”选项板，双击路径元素以激活编辑模式并绘制路径，如图所示。

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b21.png)

- 导航到路径属性命名为"escapeRoute",位置参数中Z坐标设置为"100",打开路径属性的"点"部分.大致修改Z的坐标

  <img src="E:\Anylogicprofessional\models\airdefensesystemimage\b22.png" style="zoom:25%;" />

- 将“点节点”从“空间标记”选项板添加到路径的末尾，确保节点连接到路径。命名"exitNode".将其位置和大小部分的 Z 参数设置为340.

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b24.png)

- 打开 轰炸机代理，单击“away”状态以导航到其属性，并将“进入行动”操作更改为："moveTo( main.exitNode ); ",表示轰炸机离开时按主出口节点飞行

![](E:\Anylogicprofessional\models\airdefensesystemimage\b25.png)

- 运行模型。了解轰炸机如何使用路径路线返回基地。


![](E:\Anylogicprofessional\models\airdefensesystemimage\b26.png)

- 隐藏逃生路线的线条,将路径属性和出口节点属性可见参数设置为"否"

![](E:\Anylogicprofessional\models\airdefensesystemimage\b27.png)

![](E:\Anylogicprofessional\models\airdefensesystemimage\b28.png)

- 查看运行效果,逃生路线隐藏

![](E:\Anylogicprofessional\models\airdefensesystemimage\b29.png)



### 第3阶段:创建炸弹

#### 步骤1. 新建代理模型bombs

- 将代理元素从“代理”选项板拖到 主要图。将其放置在模型动画左侧的轰炸机群附近。

![](E:\Anylogicprofessional\models\airdefensesystemimage\c1.png)



- 选择创建新的代理群体

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b2.png)

- 将Bomb填入字段名称中,作为炸弹名,单击下一步执行

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c2.png)



- 将选择动画参数选为3D,在军事中选择炸弹类型,进行下一步

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c3.png)

  

- 点击添加2个新参数,设置参数名target,类型为其他,选择building作为炸弹任务的目标建筑物.同理新建参数名为bomber,类型其他,Bomber作为炸弹任务的携带者,直接进入下一步

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c4.png)

  

- 创建初始为空的群,在模拟运行时添加代理,点击完成

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b6.png)

- 查看新创建的代理,以及动画形状

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c6.png)

#### 步骤2.调整动画形状比例

- 单击打开bomb图查看属性,将附加比例参数设置为300%

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c7.png)

#### 步骤3.创造炸弹和建筑物之间的相互作用

- 双击Bomb进入其关系图,切换到代理选项板的状态图部分

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c8.png)

- 将“状态图入口点”元素拖到 Bomb代理,打开属性界面在行动栏输入参数"setXYZ( bomber.getX(), bomber.getY(), bomber.getZ() );"

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c9.png)

- 单击状态元素并将其从组件面板中拖到前面绘制的“状态图入口点”元素。当出现绿点时释放鼠标按钮。它表示这两个元素将连接。命名"Falling",打开属性栏.在进入行动栏输入代码"moveTo( target.getX(), target.getY(), target.getZ() );"

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c10.png)

- 将“过渡”元素拖到关系图上的“Falling”状态并连接它们。然后导航到其属性，并将“触发通过”参数设置为“智能体到达”

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c11.png)

- 将“最终状态”元素拖到代理关系图中，并将其连接到上次添加的过渡元素上。然后导航到其“属性”视图，并在“输入操作”字段中键入以下代码"main.remove_bombs( this );"，以便在传递消息后销毁当前炸弹：

![](E:\Anylogicprofessional\models\airdefensesystemimage\c12.png)





#### 步骤4.定义炸弹投掷

- 进入main关系图,双击bombers进入轰炸机代理图![](E:\Anylogicprofessional\models\airdefensesystemimage\c13.png)

- 单击  Transition 元素以打开其属性，并通过键入以下代码"main.add_bombs(target,this);"来修改“行动”字段：

![](E:\Anylogicprofessional\models\airdefensesystemimage\c14.png)

- 运行模型，并在3D视图模式下观看炸弹落在建筑物上效果,炸弹正在不自然地缓慢下降，这是因为炸弹的初始速度设置为默认的每秒10米。![](E:\Anylogicprofessional\models\airdefensesystemimage\c15.png)



#### 步骤5.定义炸弹的速度

- 打开main界面的bombs群,进入属性界面,修改炸弹的初始速度为400千米/小时,重新运行炸弹下落速度会加快

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c16.png)

#### 步骤6.将信息从炸弹传输到建筑物(建筑物被击中反应)

- 打开炸弹代理图，单击迁移状态以导航到其属性，并将“行动”栏添加代码"deliver( "You are destroyed", target ); "

![](E:\Anylogicprofessional\models\airdefensesystemimage\c17.png)



#### 步骤7.修改建筑代理

- 打开建筑代理图Building

![](E:\Anylogicprofessional\models\airdefensesystemimage\c18.png)

- 单击变量元素并将其从“代理”面板的“代理组件”部分拖到关系图上并命名destroyed,导航到其属性界面,将类型设置为boolean,初始值输入"false"

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c19.png)

- 单击connection元素以打开其属性，并在“通讯”部分的“接受消息时”字段中键入以下代码："destroyed = true;" 

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c20.png)

- 导航到 三维物体板，然后将 Fire 对象拖到 Building图。将出现一个对话框“3D 对象的大小将自动更改以匹配代理的比例”,单击“是”。

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c21.png)

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c22.png)

- 导航到fire对象的“属性”视图并执行以下更改：
  单击可见参数右侧的图标以切换到代码字段，然后输入"destroyed"。一旦被轰炸，它将使火出现在房子周围。修改属性

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c23.png)

- 运行模型.查看建筑物击中效果,建筑物被轰炸后,飞机还会进行二次轰炸.重新进行任务分配来修复

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c24.png)

#### 步骤8.修改任务分配(做到这里了)

- 进入main界面.单击"startMission",进入属性视图,在行动栏输入代码,控制飞机轰炸未轰炸目标

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\c25.png)



- 查看运行效果,飞机不会再重复轰炸同一个目标

![](E:\Anylogicprofessional\models\airdefensesystemimage\c26.png)

### 第4阶段:增加防空系统

#### 步骤1. 新建代理模型bombs

- 将代理元素从“代理”选项板拖到 主要图。将其放置在模型动画左侧的轰炸机群附近。

![](E:\Anylogicprofessional\models\airdefensesystemimage\d1.png)



- 选择创建新的代理群体

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b2.png)

- 将Radar填入字段名称中,作为雷达名,单击下一步执行

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d2.png)



- 将选择动画参数选为3D,在军事中选择导弹,进行下一步

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d3.png)

  

- 点击添加新参数,设置参数名range,类型为double,输入200在表达式中进入下一步

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d4.png)

- 确认取消选中应用随机布局复选框,单击完成创建第一个雷达

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d5.png)

#### 步骤2.创建第二个雷达

- 将代理元素从“代理”选项板拖到 主要图。将其放置在模型动画左侧的轰炸机群附近。

![](E:\Anylogicprofessional\models\airdefensesystemimage\d1.png)



- 选择使用现有代理群体

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d6.png)

- 选择Radar作为要使用的代理类型。指定radar2在“代理名称”字段中。单击“完成”。

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d7.png)



- 单击main图中的radar2 代理打开其属性,在range栏中输入200,指定雷达的覆盖范围

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d8.png)

  

- 将两个雷达的动画拖到main图的保护区，如图所示

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d9.png)

- 运行模型并确保雷达位于轰炸机的路线上

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d10.png)

#### 步骤3.调整雷达方向

- 进入Radar界面.旋转动画使雷达头朝相反移动180度

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d11.png)

#### 步骤4.创建导弹代理类型

- 将代理元素从“代理”选项板拖到main图。将其放置在来那个雷达群体的左侧。

![](E:\Anylogicprofessional\models\airdefensesystemimage\d12.png)



- 选择创建新的代理群体

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\b2.png)

- 将Missile填入字段名称中,作为导弹名,单击下一步执行

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d13.png)



- 将选择动画参数选为3D,在军事中选择导弹,进行下一步

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d14.png)

  

- 点击添加2个新参数,设置参数名radar,类型为其他,下拉列表选择Radar,同理添加参数名为bombers,类型为其他,下拉列表选择Bomber


![](E:\Anylogicprofessional\models\airdefensesystemimage\d15.png)

![](E:\Anylogicprofessional\models\airdefensesystemimage\d16.png)

- 选择“创建初始空填充，我将在模型运行时添加代理”选项,单击完成

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d17.png)

#### 步骤5.指定导弹速度

- 进入main图选择missiles打开导弹属性,设置初始速度位900千米/小时

![](E:\Anylogicprofessional\models\airdefensesystemimage\d18.png)

#### 步骤6.调整动画形状的比例

- 打开Missile界面,点击动画图像进入属性,设置附加比例为400.来放大图像

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d19.png)

#### 步骤7.定义导弹的行为

- 将“状态图入口点”元素拖到 Missile代理界面。导航到其“属性”视图，然后在“操作”字段中键入以下代码："setXYZ(radar.getX(), radar.getY(), radar.getZ());"

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d20.png)



- 将“状态”元素拖到 Missile代理界面并与"状态图入口点相连",命名"Flying",导航到其“属性”视图，然后在“操作”字段中键入以下代码："moveTo（ target.getX（）， target.getY（）， target.getZ（） ）;"

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d21.png)

  

- 将“过渡”元素拖到图中，并将其连接到“飞行”状态，如下图所示。命名调整并将其超时参数设置为0.05 秒。

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d22.png)

- 将“过渡”元素拖到 Missile图并连接它们。命名AtTarget并导航到其属性并执行以下更改：将“触发通过”参数设置为“条件”。在“条件”字段中键入以下代码:"distanceTo(target)<10"，以指定导弹爆炸到轰炸机的距离：
  在“操作”字段中键入以下代码:"deliver( "You are destroyed", target );"，以指定导弹将传递给轰炸机的消息：

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d26.png)

- 将“最终状态”元素拖到状态图中，并将其连接到 AtTarget 元素。命名Exploded，然后在其属性的“操作”字段中键入以下代码 "main.remove_missiles( this );"— 在信息传递后销毁当前导弹

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d24.png)



- 将另一个过渡元素拖到“Flying”元素中。命名OutOfRange并导航到其属性并执行以下更改：将“触发通过”参数设置为“条件”。通过在“条件”字段中键入以下代码，指定导弹爆炸到轰炸机的距离："distanceTo(radar)>radar.range"
  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d27.png)

#### 步骤8.对导弹发射和制导进行编程

- 在 Radar界面命名引导式导弹guidedmissiles并将元素类设置为导弹。该集合将包含目前由雷达制导的导弹。

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d28.png)

- 单击Radar关系图的空白区域，用于打开代理的属性并将以下代码添加到“步骤”字段中：

  ```
  //for all bombers in the air
  for(Bomber b:main.bombers){
  if(guidedmissiles.size()>=2)
  break
  //if within engagement range
  //already engaged by another missile?
  if(distancedTo(b)<range){
  boolean engaged=flase;
  for(Missile m:main.missiles){
  if(m.target==b){
  engaged=true;
  break;}}
  if(engaged)
  continue;//proceed to the next bomber
  //engage(create a new missile)
  Missile m=main.add_missiles(this,b);
  guideedmissiles.add(m);//register guided missile
  }}
  ```

#### 步骤9:启用步骤

- 进入main代理图,然后选择空间和网络部分中的启用步骤选项。保留默认设置：1 秒。

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d29.png)

  

#### 步骤10:调整导弹行为

- 进入main关系图,双击bombers进入轰炸机代理图![](E:\Anylogicprofessional\models\airdefensesystemimage\c13.png)

- 单击Exploded元素以打开其属性，并通过键入以下代码"radar.guidedmissiles.remove( this );"来修改“行动”字段：

![](E:\Anylogicprofessional\models\airdefensesystemimage\d30.png)



#### 步骤11.修改轰炸机的状态图

- 进入Bomber界面,选择状态图的状态元素,绘制如下图所示

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d31.png)

- 将过渡元素拖到关系图中，并将其连接到以前绘制的状态元素。导航到其属性并将“触发通过”参数设置为“消息”。指定“"You are destroyed"”在消息字段中。“操作”字段添加代码:"main.remove_bombers(this);"

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d32.png)

- 将“最终状态”元素添加到代理关系图中，并将其连接到刚刚添加的  Transition 元素。状态应如下所示：

  ![](E:\Anylogicprofessional\models\airdefensesystemimage\d33.png)

- 运行模型。你会看到导弹在达到攻击距离时爆炸。一旦朝向轰炸机的导弹爆炸，轰炸机就会消失。

#### 步骤12.当目标被击中时停止轰炸

- 打开炸弹代理图，选择离开“Falling”状态的过渡,导航到其属性栏,在行动栏中添加代码:""搜索尚未被摧毁的建筑物。如果不存在显示没有更多的目标。任务完成！消息显示在控制台中，模拟完成。![](E:\Anylogicprofessional\models\airdefensesystemimage\d34.png)

- 运行项目,查看运行结果,项目完成

