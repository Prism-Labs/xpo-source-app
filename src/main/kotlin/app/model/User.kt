

package app.model

import app.Protos
import com.google.protobuf.InvalidProtocolBufferException
import java.security.InvalidParameterException
import app.Logger

/**
 * User information.
 */
data class User (
    var repos: MutableList<Repo> = mutableListOf(),
    var emails: HashSet<UserEmail> = hashSetOf<UserEmail>()
) {
    @Throws(InvalidParameterException::class)
    constructor(proto: Protos.User) : this() {
        repos = proto.reposList.map { repo -> Repo(repo) }
            .toMutableList()
        emails = proto.emailsList.map { email -> UserEmail(email) }.toHashSet()
		var x: String = getProto().toString()
	   // Logger.info { "Model user Response Start --> $x --> Model user Response  End" }
    }

    @Throws(InvalidProtocolBufferException::class)
    constructor(bytes: ByteArray) : this(Protos.User.parseFrom(bytes))

    constructor(serialized: String) : this(serialized.toByteArray())

    fun getProto(): Protos.User {
        return Protos.User.newBuilder()
            .addAllRepos(repos.map { repo -> repo.getProto() })
            .addAllEmails(emails.map { email -> email.getProto() })
            .build()
    }

    fun serialize(): ByteArray {
	    var x: String = getProto().toString()
	   // Logger.info { "Model user Request Start --> $x --> Model user Request  End" }
        return getProto().toByteArray()
    }
}
