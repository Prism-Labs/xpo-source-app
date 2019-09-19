

package app.extractors

object SwiftExtractor : ExtractorBase(
    language = Lang.SWIFT,
    importRegex = Regex("""import\s+(\w+)"""),
    commentRegex = Regex("""^([^\n]*//)[^\n]*"""))
