

package app.extractors

import app.model.CommitStats
import app.model.DiffFile

class Extractor : ExtractorInterface {
    companion object {
        val RESTRICTED_EXTS = listOf(".min.js")
    }

    override fun extract(files: List<DiffFile>): List<CommitStats> {
        return files
            .filter { file -> !RESTRICTED_EXTS.contains(file.extension) }
            .mapNotNull { file ->
                Heuristics.analyze(file)
            }
            .fold(mutableListOf()) { accStats, stats ->
                accStats.addAll(stats)
                accStats
            }
    }
}
