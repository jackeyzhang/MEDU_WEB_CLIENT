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
 * 4:48:26
 *
 * TODO:
 */
public interface IModelDataService<T>{
	
	/**
	 * ���ģ�����ֲ���ģ��
	 * 
	 * @param modelName
	 * @return
	 */
	IModel getModelByName(String modelName);
	
	/**
	 * ���ģ�����Ͳ���ģ��
	 * @param modelType
	 * @return
	 */
	List<IModel> listModelByType(String modelType);
	
	/**
	 * ����model
	 * @return
	 */
	List<IModel> listAllModel();

}
