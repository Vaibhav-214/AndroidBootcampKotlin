package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.File
import javax.sound.sampled.AudioSystem

fun main() {
    //println(Thread.currentThread().toString()+ "before")
    runBlocking {
        launch {
            this.toString()
            //println(Thread.currentThread().toString() + "middle")
            playBeats(
                "x-x-x-x-x-x-",
                "/Users/vaibhavpatil/IdeaProjects/AndroidEssentials/src/main/kotlin/coroutines/toms.aiff",
                coroutine = this.toString())
            //println(Thread.currentThread().toString() + "middle")
        }
        playBeats(
            "x-----x-----",
            "/Users/vaibhavpatil/IdeaProjects/AndroidEssentials/src/main/kotlin/coroutines/crash_cymbal.aiff",
            coroutine = this.toString())

    }

   // Thread.sleep(2000)

  //  println(Thread.currentThread().toString())

}


suspend fun playBeats(beats: String, file: String, coroutine: String) {
    val parts = beats.split("x")

    var count = 0
    for(part in parts) {
        count += part.length + 1
        if (part == "") {
            playSound(file, coroutine)
            //print("bang ")
        } else {
            delay(100*(part.length + 1L))
            if (count < beats.length) {
                playSound(file, coroutine)
               // print("bang ")

            }
        }
    }
}

fun playSound(file: String, coroutine: String) {
    println(Thread.currentThread().toString()+ coroutine)

    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(File(file))
    clip.open(audioInputStream)
    clip.start()
}