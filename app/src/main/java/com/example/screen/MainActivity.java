package com.example.screen;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int or=getResources().getConfiguration().orientation;
        if(or==this.getResources().getConfiguration().ORIENTATION_PORTRAIT){
            setContentView(R.layout.james);
            textView=(TextView)findViewById(R.id.textView2);
            textView.setText("James Gosling received a Bachelor of Science from the University of Calgary [4] and his M.A. and Ph.D. from Carnegie Mellon University, all in computer science.[2][5][6] He wrote a version of Emacs called Gosling Emacs (Gosmacs) while working toward his doctorate. He built a multi-processor version of Unix for a 16-way computer system[7] while at Carnegie Mellon University, before joining Sun Microsystems. He also developed several compilers and mail systems there.\n" +
                    "Gosling was with Sun Microsystems between 1984 and 2010 (26 years). He is known as the father of the Java programming language.[8][9] He got the idea for the Java VM while writing a program to port software from a PERQ by translating Perq Q-Code to VAX assembler and emulating the hardware. He left Sun Microsystems on April 2, 2010 after it was acquired by the Oracle Corporation,[8] citing reductions in pay, status, and decision-making ability, along with change of role and ethical challenges.[10] He has since taken a very critical stance towards Oracle in interviews, noting that \"during the integration meetings between Sun and Oracle, where we were being grilled about the patent situation between Sun and Google, we could see the Oracle lawyer's eyes sparkle.\"[9] He clarified his position during the Oracle v Google trial over Android: \"While I have differences with Oracle, in this case, they are on the right. Google totally slimed Sun. We were all really disturbed, even Jonathan Schwartz; he just decided to put on a happy face and tried to turn lemons into lemonade, which annoyed a lot of folks on Sun.\"[11] However, he approved of the court's ruling that APIs should not be copyrightable.[12]\n" +
                    "In March 2011, Gosling left Oracle to work at Google.[13] Six months later, he followed his colleague Bill Vass and joined a startup called Liquid Robotics.[1] In late 2016, Liquid Robotics was acquired by Boeing.[14] Following the acquisition, Gosling left Liquid Robotics to work at Amazon Web Services as Distinguished Engineer in May 2017.[15]\n" +
                    "He is an adviser at the Scala company Lightbend,[16] Independent Director at Jelastic,[17] and Strategic Advisor for Eucalyptus,[18] and is a board member of DIRTT Environmental Solutions.[19]\n" +
                    "He is known for his love of proving \"the unknown\" and has noted that his favorite irrational number is √2. He has a framed picture of the first 1,000 digits of √2 in his office.[20]");
        }
        else if(or == this.getResources().getConfiguration().ORIENTATION_LANDSCAPE){
            setContentView(R.layout.activity_main);
            textView1=(TextView)findViewById(R.id.textView4);
            textView1.setText("Lovelace died at the age of 36 – the same age at which her father had died – on 27 November 1852,[47] from uterine cancer probably exacerbated by bloodletting by her physicians.[48] The illness lasted several months, in which time Annabella took command over whom Ada saw, " +
                    "and excluded all of her friends and confidants. Under her mother's influence, she had a religious transformation and was coaxed into repenting of her previous conduct and making Annabella her executor.[49] She lost contact with her husband after confessing something to him on 30 August which caused him to abandon her bedside." +
                    " It is not known what she told him.[50] She was buried, at her request, next to her father at the Church of St. Mary Magdalene in Hucknall, Nottinghamshire. A memorial plaque in Latin to her and her father is in the chapel attached to Horsley Towers.Throughout her life, Lovelace was strongly interested in scientific developments and fads of the day, including phrenology[51] and mesmerism.[52] After her work with Babbage, Lovelace continued to work on other projects. In 1844 she commented to a friend Woronzow Greig about her desire to create a mathematical model for how the brain gives rise to thoughts and nerves to feelings (\"a calculus of the nervous system\").[53] She never achieved this, however. In part, her interest in the brain came from a long-running pre-occupation," +
                    " inherited from her mother, about her 'potential' madness. As part of her research into this project, she visited the electrical engineer Andrew Crosse in 1844 to learn how to carry out electrical experiments.[54] In the same year, she wrote a review of a paper by Baron Karl von Reichenbach, Researches on Magnetism, but this was not published and does not appear to have progressed past the first draft.[55] In 1851, the year before her cancer struck, she wrote to her mother mentioning \"certain productions\" she was working on regarding the relation of maths and music.[56] Throughout her life, Lovelace was strongly interested in scientific developments and fads of the day, including phrenology[51] and mesmerism.[52] After her work with Babbage, Lovelace continued to work on other projects. " +
                    "In 1844 she commented to a friend Woronzow Greig about her desire to create a mathematical model for how the brain gives rise to thoughts and nerves to feelings (\"a calculus of the nervous system\").[53] She never achieved this, however. In part, her interest in the brain came from a long-running pre-occupation, inherited from her mother, about her 'potential' madness. As part of her research into this project, she visited the electrical engineer Andrew Crosse in 1844 to learn how to carry out electrical experiments.[54] In the same year, she wrote a review of a paper by Baron Karl von Reichenbach, Researches on Magnetism, but this was not published and does not appear to have progressed past the first draft.[55] In 1851, the year before her cancer struck, she wrote to her mother mentioning " +
                    "\"certain productions\" she was working on regarding the relation of maths and music.[56]  ");
        }
    }
}
