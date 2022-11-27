package com.example.hanstagram.navigation.model

import java.sql.Timestamp

data class ContentDTO(var explain : String? = null,
                      var imageUrl : String? = null,
                      var uid : String? = null,
                      var userId : String? = null,
                      var timestamp: Long? = null,
                      var favorites : Map<String,Boolean> = HashMap()){
    data class Comment(var uid: String? = null,
                       var userId : String? = null,
                       var comment : String? = null,
                       var timestamp: Long? = null)
}