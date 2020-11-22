import com.google.auto.service.AutoService
import net.mamoe.mirai.console.plugin.jvm.JvmPlugin
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin

@AutoService(JvmPlugin::class)
object KwReply : KotlinPlugin(
        JvmPluginDescription(
                "net.im45.bot.kwr",
                "0.1",
                "Keyword Reply"
        )
)
