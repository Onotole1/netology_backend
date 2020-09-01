package ru.netology.model

import java.time.LocalDateTime

data class PostModel(
    val id: Int,
    val author: String,
    val content: String = "",
    val created: LocalDateTime = LocalDateTime.now(),
    val likesCount: Int = 0,
    val commentsCount: Int = 0,
    val shareCount: Int = 0,
    val likedByMe: Boolean = false,
    val commentedByMe: Boolean = false,
    val sharedByMe: Boolean = false,
    val address: String? = null,
    val location: Location? = null,
    val video: Video? = null,
    val advertising: Advertising? = null,
    val source: PostModel? = null,
    val postType: PostType = PostType.SIMPLE_POST,
    val isHidden: Boolean = false,
    val timesShown: Long = 0
) {
}