package com.example.downloaddemo.listener;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/08
 *     desc   : 监听下载过程中的各种状态
 * </pre>
 */

public interface DownloadListener {
    void onProgress(int progress); //进度
    void onSuccess(); //成功
    void onFailed(); //失败
    void onPaused();  //暂停
    void onCanceled(); //取消
}
