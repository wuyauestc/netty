package wumingjia.netty.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * 服务端业务处理类
 */
@Slf4j
public class NettyServerHandler extends SimpleChannelInboundHandler<String> {

    /**
     * 通道读取就绪事件--接受客户端请求
     * @param channelHandlerContext
     * @param s
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {
        log.info("===========服务端接收到的消息{}", s);
        //https://www.bilibili.com/video/BV1Y84y1F78b/?spm_id_from=333.337.search-card.all.click&vd_source=3313fc2fb3482d1df0606c742fc5fadc
    }
}
