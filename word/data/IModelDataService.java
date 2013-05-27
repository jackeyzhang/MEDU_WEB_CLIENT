/**
 * 
 */
package data;

import java.util.List;


/**
 * @author zhangchenhao
 *
 *
 * 2013-5-27
 * 下午4:48:26
 *
 * TODO:
 */
public interface IModelDataService<T>{
	
	/**
	 * 根据模型名字查找模型
	 * 
	 * @param modelName
	 * @return
	 */
	IModel getModelByName(String modelName);
	
	/**
	 * 根据模型类型查找模型
	 * @param modelType
	 * @return
	 */
	List<IModel> listModelByType(String modelType);
	
	/**
	 * 所有model
	 * @return
	 */
	List<IModel> listAllModel();

}
