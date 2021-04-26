package org.trayNotification.animations;

import org.trayNotification.models.CustomStage;

import java.util.function.Function;

public enum Animations {

	SLIDE(SlideAnimation::new),
	FADE(FadeAnimation::new),
	POPUP(PopupAnimation::new);

	private final Function<CustomStage, Animation> newInstance;

	Animations(Function<CustomStage, Animation> newInstance) {
		this.newInstance = newInstance;
	}

	public Animation newInstance(CustomStage stage) {
		return newInstance.apply(stage);
	}

}
