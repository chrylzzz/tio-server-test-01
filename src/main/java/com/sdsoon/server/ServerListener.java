package com.sdsoon.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.intf.Packet;
import org.tio.server.intf.ServerAioListener;

/**
 * 六个接口
 * <p>
 * Created By Chr on 2019/4/16.
 */
public class ServerListener implements ServerAioListener {

    private static Logger log = LoggerFactory.getLogger(ServerListener.class);

    /**
     * 建链后触发本方法，注：建链不一定成功，需要关注参数isConnected
     *
     * @param channelContext
     * @param isConnected    是否连接成功,true:表示连接成功，false:表示连接失败
     * @param isReconnect    是否是重连, true: 表示这是重新连接，false: 表示这是第一次连接
     * @throws Exception
     * @author: tanyaowu
     */
    @Override
    public void onAfterConnected(ChannelContext channelContext, boolean isConnected, boolean isReconnect) throws Exception {
       // log.info("onAfterConnected-------{}", channelContext);
    }

    /**
     * 原方法名：onAfterDecoded
     * 解码成功后触发本方法,握手之后随心跳执行========================
     *
     * @param channelContext
     * @param packet
     * @param packetSize
     * @throws Exception
     * @author: tanyaowu
     */
    @Override
    public void onAfterDecoded(ChannelContext channelContext, Packet packet, int packetSize) throws Exception {
//        RequestPacket r = new RequestPacket();
//        r.setBody("测试?".getBytes(RequestPacket.CHARSET));
//        Tio.bindGroup(channelContext, "bbb");
//        Tio.sendToGroup(channelContext.groupContext, "bbb", r);
////        Tio.send(channelContext, r);
//        log.info("onAfterDecoded-------{}", channelContext);
    }

    /**
     * 接收到TCP层传过来的数据后,握手之后随心跳执行========================
     *
     * @param channelContext
     * @param receivedBytes  本次接收了多少字节
     * @throws Exception
     */
    @Override
    public void onAfterReceivedBytes(ChannelContext channelContext, int receivedBytes) throws Exception {
       // log.info("onAfterReceivedBytes-------{}", channelContext);
    }

    /**
     * 消息包发送之后触发本方法
     *
     * @param channelContext
     * @param packet
     * @param isSentSuccess  true:发送成功，false:发送失败
     * @throws Exception
     * @author tanyaowu
     */
    @Override
    public void onAfterSent(ChannelContext channelContext, Packet packet, boolean isSentSuccess) throws Exception {

       // log.info("onAfterSent-------{}", channelContext);
    }

    /**
     * 处理一个消息包后,握手之后随心跳执行=============================
     *
     * @param channelContext
     * @param packet
     * @param cost           本次处理消息耗时，单位：毫秒
     * @throws Exception
     */
    @Override
    public void onAfterHandled(ChannelContext channelContext, Packet packet, long cost) throws Exception {

       // channelContext.getClientNode().toString();//客户端的ip
        //log.info("onAfterHandled--------------{}", channelContext);
        //Tio.sendToGroup(channelContext.groupContext, , wsResponse);
    }

    /**
     * 连接关闭前触发本方法
     *
     * @param channelContext the channelcontext
     * @param throwable      the throwable 有可能为空
     * @param remark         the remark 有可能为空
     * @param isRemove
     * @throws Exception
     * @author tanyaowu
     */
    @Override
    public void onBeforeClose(ChannelContext channelContext, Throwable throwable, String remark, boolean isRemove) throws Exception {
      //  log.info("onBeforeClose-------{}", channelContext);
    }

    /**
     * 连接关闭前后触发本方法
     * 警告：走到这个里面时，很多绑定的业务都已经解绑了，所以这个方法一般是空着不实现的
     * @param channelContext the channelcontext
     * @param throwable the throwable 有可能为空
     * @param remark the remark 有可能为空
     * @param isRemove 是否是删除
     * @throws Exception
     * @author: tanyaowu
     */
//    public void onAfterClose(ChannelContext channelContext, Throwable throwable, String remark, boolean isRemove) throws Exception;
}
