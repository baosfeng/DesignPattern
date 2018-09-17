package com.composite;

/**
 * 图像文件查杀
 *
 * @author Administrator
 * @date 2018/8/21
 */
public class ImageLeaf implements Component {

	private String imageName;

	ImageLeaf(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public void killVirus() {
		System.out.println("查杀图像文件为" + imageName + "的文件");
	}
}


/**
 * 文本文件查杀
 *
 * @author Administrator
 * @date 2018/8/21
 */
class TextLeaf implements Component {

	String textName;

	TextLeaf(String textName) {
		this.textName = textName;
	}

	@Override
	public void killVirus() {
		System.out.println("查杀图像文件为" + textName + "的文件");
	}
}

/**
 * 视频文件查杀
 *
 * @author Administrator
 * @date 2018/8/21
 */
class VideoLeaf implements Component {

	private String videoName;

	VideoLeaf(String videoName) {
		this.videoName = videoName;
	}

	@Override
	public void killVirus() {
		System.out.println("查杀图像文件为" + videoName + "的文件");
	}
}