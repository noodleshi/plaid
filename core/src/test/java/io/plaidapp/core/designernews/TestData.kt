/*
 * Copyright 2018 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.plaidapp.core.designernews

import io.plaidapp.core.designernews.data.comments.model.CommentLinksResponse
import io.plaidapp.core.designernews.data.comments.model.CommentResponse
import io.plaidapp.core.designernews.data.users.model.User
import okhttp3.MediaType
import okhttp3.ResponseBody
import java.util.GregorianCalendar

/**
 * Test data
 */

const val parentId = 1L

val user = User(
    id = 111L,
    firstName = "Plaicent",
    lastName = "van Plaid",
    displayName = "Plaicent van Plaid",
    portraitUrl = "www"
)

val links = CommentLinksResponse(
    userId = user.id,
    story = 999L,
    parentComment = parentId
)

val replyResponse1 = CommentResponse(
    id = 11L,
    body = "commenty comment",
    created_at = GregorianCalendar(1988, 1, 1).time,
    links = links
)

val replyResponse2 = CommentResponse(
    id = 12L,
    body = "commenty comment",
    created_at = GregorianCalendar(1908, 2, 8).time,
    links = links
)

val repliesResponses = listOf(
    replyResponse1,
    replyResponse2
)

val errorResponseBody = ResponseBody.create(MediaType.parse(""), "Error")
