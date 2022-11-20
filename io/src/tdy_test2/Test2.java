package tdy_test2;

import java.io.File;
import java.util.List;

public class Test2 {
    /**
     * 递归实现输入任意目录，列出文件以及文件夹
     *
     * 设计：在FileUtils类里面实现了逻辑操作，在另一边调用就可以了
     * */
    public static void main(String[] args) {
        //比如输入D盘
        List  list=FileUtils.getAllFiles("D:");
        //输出所有的文件和文件夹的名字
        for (Object file:list) {
            System.out.println(file);
        }

    }

}

