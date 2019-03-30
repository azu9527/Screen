package com.example.screen;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int or=getResources().getConfiguration().orientation;
        String lan = getResources().getConfiguration().locale.getLanguage();

        if(or==this.getResources().getConfiguration().ORIENTATION_PORTRAIT){
            setContentView(R.layout.james);
            textView=(TextView)findViewById(R.id.textView2);
            if(lan.equals("zh")){
                textView.setText("James Gosling获得了卡尔加里大学的理学学士学位[4]和卡内基梅隆大学的硕士和博士学位，全部是计算机科学[2][5][6]他在攻读博士学位的同时，写了一个名为Gosling Emacs（Gosmacs）的Emacs版本。他在卡内基梅隆大学（Carnegie Mellon University）期间，在加入Sun Microsystems之前，为16路计算机系统[7]构建了一个多处理器版本的Unix。他还在那里开发了几个编译器和邮件系统。\\n“+              “1984年至2010年（26年）期间，高斯林与太阳微系统合作。他被称为Java编程语言之父。〔8〕〔9〕，他通过将Pyq Q代码翻译成VAX汇编程序并模拟硬件来编写程序来从Pyq编写端口软件，从而获得Java VM的思想。他于2010年4月2日离开Sun Microsystems，此前该公司被甲骨文公司收购，[8]称其薪酬、地位和决策能力下降，以及角色和道德挑战的变化，[10]此后，他在采访中对甲骨文采取了非常关键的立场，并指出“在Sun与ORAC的整合会议期间”Le，当我们被问及Sun和谷歌之间的专利问题时，我们可以看到甲骨文律师的眼睛闪闪发光。“[9]他在甲骨文诉谷歌安卓审判中澄清了自己的立场：“虽然我和甲骨文有分歧，但在本案中，他们是对的。谷歌完全缩小了太阳。我们都很不安，连乔纳森·施瓦茨也不例外；他只是决定装出一副高兴的样子，试图把柠檬变成柠檬水，这让很多太阳上的人很恼火。+              “2011年3月，戈斯林离开甲骨文在谷歌工作[13]6个月后，他跟随他的同事比尔•瓦斯加入了一家名为Liquid Robotics的初创公司[1]2016年底，Liquid Robotics被波音公司收购[14]收购后，戈斯林于2017年5月离开Liquid Robotics在亚马逊网络服务公司担任杰出工程师[15]。\\n +              “他是斯卡拉公司Lightbend的顾问，[16]Jelatic的独立董事，[17]和Eucalyptus的战略顾问，[18]并且是Dirtt环境解决方案的董事会成员[19]\\n”+              他以爱证明“未知”而闻名，并指出他最喜欢的无理数是√2。他办公室里有√2前1000位数字的加框照片。 ");
            }
            else {
                textView.setText("James Gosling received a Bachelor of Science from the University of Calgary [4] and his M.A. and Ph.D. from Carnegie Mellon University, all in computer science.[2][5][6] He wrote a version of Emacs called Gosling Emacs (Gosmacs) while working toward his doctorate. He built a multi-processor version of Unix for a 16-way computer system[7] while at Carnegie Mellon University, before joining Sun Microsystems. He also developed several compilers and mail systems there.\n" +
                        "Gosling was with Sun Microsystems between 1984 and 2010 (26 years). He is known as the father of the Java programming language.[8][9] He got the idea for the Java VM while writing a program to port software from a PERQ by translating Perq Q-Code to VAX assembler and emulating the hardware. He left Sun Microsystems on April 2, 2010 after it was acquired by the Oracle Corporation,[8] citing reductions in pay, status, and decision-making ability, along with change of role and ethical challenges.[10] He has since taken a very critical stance towards Oracle in interviews, noting that \"during the integration meetings between Sun and Oracle, where we were being grilled about the patent situation between Sun and Google, we could see the Oracle lawyer's eyes sparkle.\"[9] He clarified his position during the Oracle v Google trial over Android: \"While I have differences with Oracle, in this case, they are on the right. Google totally slimed Sun. We were all really disturbed, even Jonathan Schwartz; he just decided to put on a happy face and tried to turn lemons into lemonade, which annoyed a lot of folks on Sun.\"[11] However, he approved of the court's ruling that APIs should not be copyrightable.[12]\n" +
                        "In March 2011, Gosling left Oracle to work at Google.[13] Six months later, he followed his colleague Bill Vass and joined a startup called Liquid Robotics.[1] In late 2016, Liquid Robotics was acquired by Boeing.[14] Following the acquisition, Gosling left Liquid Robotics to work at Amazon Web Services as Distinguished Engineer in May 2017.[15]\n" +
                        "He is an adviser at the Scala company Lightbend,[16] Independent Director at Jelastic,[17] and Strategic Advisor for Eucalyptus,[18] and is a board member of DIRTT Environmental Solutions.[19]\n" +
                        "He is known for his love of proving \"the unknown\" and has noted that his favorite irrational number is √2. He has a framed picture of the f");
            }
        }
        else if(or == this.getResources().getConfiguration().ORIENTATION_LANDSCAPE){
            setContentView(R.layout.activity_main);
            textView1=(TextView)findViewById(R.id.textView4);
            if(lan.equals("zh")){
                textView1.setText("Lovelace于1852年11月27日死于子宫癌，享年36岁，与她父亲死于同一年龄，【47】可能是由于医生放血而加重的。【48】疾病持续了几个月，在这段时间里，Annabella接管了Ada所见的人，”。+              排除了她所有的朋友和知己。在母亲的影响下，她进行了宗教转变，并被劝说为对自己以前的行为进行忏悔，使安娜贝拉成为自己的遗嘱执行人。8月30日，她向丈夫忏悔了一件事，并与丈夫失去了联系，导致安娜贝拉放弃了床边。+              “不知道她对他说了些什么。应她请求，她被葬在诺丁汉郡哈克纳尔的圣玛丽抹大拉教堂，她父亲的旁边。她和她父亲的一块用拉丁语写的纪念牌匾在霍斯利大厦旁的小礼拜堂里。在她的一生中，洛夫蕾丝对当时的科学发展和时尚非常感兴趣，其中包括相骨学[51]和魔法学[52]在她与巴贝奇合作之后，洛夫蕾丝继续从事其他项目。1844年，她对一位朋友沃朗佐夫·格雷格（Woronzow Greig）评论说，她希望建立一个数学模型，来解释大脑如何产生思想和情感神经（“神经系统的微积分”）。[53]然而，她从未做到这一点。在某种程度上，她对大脑的兴趣来自长期的职业前。+              从她母亲那里继承下来的，关于她“潜在的”疯狂。作为对这个项目的研究的一部分，她在1844年拜访了电气工程师安德鲁·克罗斯，学习如何进行电气实验[54]同年，她写了一篇由卡尔·冯·赖琴巴赫男爵撰写的论文《磁学研究》，但这篇论文没有发表，似乎也没有超过初稿[55]。]1851年，也就是癌症爆发的前一年，她写信给母亲，提到她在研究数学和音乐的关系时所做的“某些作品”。[56]在她一生中，洛夫蕾丝对科学的发展和当时的时尚非常感兴趣，其中包括相思学[51]和催眠术[52]在她与巴贝奇、洛夫合作之后。Elace继续从事其他项目。”+              “1844年，她对一位朋友沃朗佐夫·格雷格（Woronzow Greig）评论说，她希望建立一个数学模型来解释大脑是如何将思想和神经转化为情感的（“神经系统的微积分”）。[53]然而，她从未做到这一点。在某种程度上，她对大脑的兴趣来自长期的职业前准备，继承自她母亲，关于她“潜在的”疯狂。作为对这个项目的研究的一部分，她在1844年拜访了电气工程师安德鲁·克罗斯，学习如何进行电气实验[54]同年，她写了一篇由卡尔·冯·赖琴巴赫男爵撰写的论文《磁性研究》的评论，但这篇论文没有发表，也没有超过初稿[55]。]1851年，也就是她患癌症的前一年，她写信给母亲说+              “某些作品”她正在研究数学和音乐的关系。 ");
            }
            else {
                textView1.setText("Lovelace died at the age of 36 – the same age at which her father had died – on 27 November 1852,[47] from uterine cancer probably exacerbated by bloodletting by her physicians.[48] The illness lasted several months, in which time Annabella took command over whom Ada saw, " +
                        "and excluded all of her friends and confidants. Under her mother's influence, she had a religious transformation and was coaxed into repenting of her previous conduct and making Annabella her executor.[49] She lost contact with her husband after confessing something to him on 30 August which caused him to abandon her bedside." +
                        " It is not known what she told him.[50] She was buried, at her request, next to her father at the Church of St. Mary Magdalene in Hucknall, Nottinghamshire. A memorial plaque in Latin to her and her father is in the chapel attached to Horsley Towers.Throughout her life, Lovelace was strongly interested in scientific developments and fads of the day, including phrenology[51] and mesmerism.[52] After her work with Babbage, Lovelace continued to work on other projects. In 1844 she commented to a friend Woronzow Greig about her desire to create a mathematical model for how the brain gives rise to thoughts and nerves to feelings (\"a calculus of the nervous system\").[53] She never achieved this, however. In part, her interest in the brain came from a long-running pre-occupation," +
                        " inherited from her mother, about her 'potential' madness. As part of her research into this project, she visited the electrical engineer Andrew Crosse in 1844 to learn how to carry out electrical experiments.[54] In the same year, she wrote a review of a paper by Baron Karl von Reichenbach, Researches on Magnetism, but this was not published and does not appear to have progressed past the first draft.[55] In 1851, the year before her cancer struck, she wrote to her mother mentioning \"certain productions\" she was working on regarding the relation of maths and music.[56] Throughout her life, Lovelace was strongly interested in scientific developments and fads of the day, including phrenology[51] and mesmerism.[52] After her work with Babbage, Lovelace continued to work on other projects. " +
                        "In 1844 she commented to a friend Woronzow Greig about her desire to create a mathematical model for how the brain gives rise to thoughts and nerves to feelings (\"a calculus of the nervous system\").[53] She never achieved this, however. In part, her interest in the brain came from a long-running pre-occupation, inherited from her mother, about her 'potential' madness. As part of her research into this project, she visited the electrical engineer Andrew Crosse in 1844 to learn how to carry out electrical experiments.[54] In the same year, she wrote a review of a paper by Baron Karl von Reichenbach, Researches on Magnetism, but this was not published and does not appear to have progressed past the first draft.[55] In 1851, the year before her cancer struck, she wrote to her mother mentioning " +
                        "\"certain productions\" she was working on regarding the relation of maths and music.[56]  ");

            }
        }
    }
}
