/**
 * 
 */
package bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangchenhao
 *
 *
 * 2013-5-26
 * 上午8:37:28
 *
 * TODO:
 */
public class Word implements Serializable {

	private static final long serialVersionUID = -2591485546266989995L;

	private int id;
	
	//写法 并非普通汉字的写法 可能有些字根需要图形表示 待扩展
	private String spell;
	
	//读音 考虑到多音字
	private List<Sound> sounds;
	
	public Word() {
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the spell
	 */
	public String getSpell() {
		return spell;
	}

	/**
	 * @param spell the spell to set
	 */
	public void setSpell(String spell) {
		this.spell = spell;
	}

	/**
	 * @return the sounds
	 */
	public List<Sound> getSounds() {
		return sounds;
	}

	/**
	 * @param sounds the sounds to set
	 */
	public void setSounds(List<Sound> sounds) {
		this.sounds = sounds;
	}

}
