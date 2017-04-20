package com.huhx0015.hxaudio.interfaces;

import com.huhx0015.hxaudio.model.HXMusicItem;

/** -----------------------------------------------------------------------------------------------
 *  [HXMusicListener] CLASS
 *  DEVELOPER: Michael Yoon Huh (Huh X0015)
 *  DESCRIPTION: HXMusicListener is an interface class used to listen for events from HXMusic.
 *  -----------------------------------------------------------------------------------------------
 */

public interface HXMusicListener {

    /** INTERFACE METHODS ______________________________________________________________________ **/

    // onMusicPrepared(): Called when HXMusic's MediaPlayer object has called onPrepared().
    void onMusicPrepared(HXMusicItem music);

    // onMusicCompletion(): Called when HXMusic's MediaPlayer object has called onCompletion().
    void onMusicCompletion(HXMusicItem music);

    // onMusicBufferingUpdate(): Called when HXMusic's MediaPlayer object has called onBufferingUpdate().
    void onMusicBufferingUpdate(HXMusicItem music, int percent);

    // onMusicPause(): Called when HXMusic's pauseMusic() method has been called.
    void onMusicPause(HXMusicItem music);

    // onMusicResume(): Called when HXMusic's resumeMusic() method has been called.
    void onMusicResume(HXMusicItem music);

    // onMusicStop(): Called when HXMusic's stopMusic() method has been called.
    void onMusicStop(HXMusicItem music);
}