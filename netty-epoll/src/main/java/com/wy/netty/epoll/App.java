package com.wy.netty.epoll;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ServerBootstrap bootstrap = new ServerBootstrap();
		int cpuNum = Runtime.getRuntime().availableProcessors();
		EventLoopGroup loopGroup = new EpollEventLoopGroup(cpuNum);
		bootstrap.group(loopGroup, loopGroup)
			.channel(NioServerSocketChannel.class)
//			.child
		;
		
		
	}
}
