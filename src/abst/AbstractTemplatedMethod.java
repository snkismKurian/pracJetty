package abst;

import interf.InterfaceTemplatedMethod;
import controllers.TemplatedSample;

/**
 * テンプレートメソッドのAbstractクラス
 * @author sin
 *
 */
public abstract class AbstractTemplatedMethod {
	
	public abstract void init (InterfaceTemplatedMethod method);
	
	public abstract void main (InterfaceTemplatedMethod method);
	
	public abstract void finl (InterfaceTemplatedMethod method);
	
	public void createTemplatedMethod() {
		
		TemplatedSample template = new TemplatedSample();
		
		init(template);
		
		main(template);
		
		finl(template);
	}

}
