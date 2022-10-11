import derevo.derive
import tofu.logging.derivation.loggable

@derive(loggable)
final case class ToLog(stringValue: String, intValue: Int)
