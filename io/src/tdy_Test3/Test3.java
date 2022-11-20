package tdy_Test3;
import java.util.List;

import tdy_test2.FileUtils;

public class Test3 {
    /**
     * 递归实现列出当前工程下所有.java文件
     * 还是要题目2的遍历文件的工具类来获取所有的文件，再过滤.java文件就可以了
     * 当前目录的地址：输入.就可以获取
     * */
    public static void main(String[] args) {
        //输入.  获取当前文件的 所有文件
        List

                list=FileUtils.getAllFiles(".");
        //输出.java后缀的文件的名字
        for (Object file : list) {
            if (file.toString().endsWith(".java")) {
               // System.out.println(file.getName());
            }
        }

    }

}
