package cn.jacken.nio;

import java.nio.ByteBuffer;

/**
 * NIO在jdk1.4出来的IO上的改进，NIO 效率高
 * NIO是非阻塞的，面向于缓冲区的（存储文件的）
 * IO 是阻塞的，面向于流的
 */
public class NioDemo {
    public static void main(String[] args) {
        //初始化缓冲区的大小
        /**
         *     private int mark = -1;
         *     private int position = 0; 缓冲区的正在操作的位置
         *     private int limit;     缓冲区的可用大小
         *     private int capacity;  缓冲区最大的容量
         *
         *
         *     核心方法；
         *     put()
         *
         *     get()
         */
        ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());

        System.out.println("-------------------");
        byteBuffer.put("abcd".getBytes());
        System.out.println("往bytebuff中存放数据");
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());

        System.out.println("-----------------");
        System.out.println("读取值");
        //开启读取模式
        byteBuffer.flip();
       byte[] bytes= new byte[byteBuffer.limit()];
       byteBuffer.get();
        System.out.println(new String(bytes,0,bytes.length));


    }
}






