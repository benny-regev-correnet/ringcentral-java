package com.ringcentral.paths.restapi.glip.chats.read

class Index(val parent: com.ringcentral.paths.restapi.glip.chats.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/read"
    }

    /**
     * Operation: Mark Chat as Read
     * Http Post /restapi/v1.0/glip/chats/{chatId}/read
     */
    fun post(): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return rb.string()

    }

}
