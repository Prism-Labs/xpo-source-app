

package app.extractors

object DartExtractor : ExtractorBase(
    language = Lang.DART,
    importRegex = Regex("""^import ['"](.+)['"];$"""),
    commentRegex = Regex("(//.+$)|(/[*].*?[*]/)"))
