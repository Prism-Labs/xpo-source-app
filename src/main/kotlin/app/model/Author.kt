// Copyright 2017 Sourcerer Inc. All Rights Reserved.
// Author: Anatoly Kislov (anatoly@sourcerer.io)

package app.model

import app.Protos
import com.google.protobuf.InvalidProtocolBufferException	
import java.security.InvalidParameterException
import app.Logger
/**
 * Commit author.
 */
data class Author(
    var name: String = "",
    var email: String = "",
    var repo: Repo = Repo()
) {
    @Throws(InvalidParameterException::class)
    constructor(proto: Protos.Author) : this() {
        email = proto.email
        name = proto.name
        repo = Repo(proto.repoRehash)
    }

    @Throws(InvalidProtocolBufferException::class)
    constructor(bytes: ByteArray) : this(Protos.Author.parseFrom(bytes))

    constructor(serialized: String) : this(serialized.toByteArray())

    fun getProto(): Protos.Author {
        return Protos.Author.newBuilder()
            .setEmail(email)
            .setName(name)
            .setRepoRehash(repo.rehash)
            .build()
    }
	
	
	fun serialize(): ByteArray {
	    var x: String=getProto().toString()
	    Logger.info { "Model Author Request Start --> $x --> Model Author Request  End" }
        return getProto().toByteArray()
    }

    // Email defines user identity.
    override fun equals(other: Any?): Boolean {
        if (other is Author) {
            return email == other.email
        }
        return false
    }

    override fun hashCode(): Int {
        return email.hashCode()
    }
}
