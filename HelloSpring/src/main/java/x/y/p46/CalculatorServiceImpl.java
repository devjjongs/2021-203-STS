package x.y.p46;

import java.util.List;
import java.util.Properties;

public class CalculatorServiceImpl implements CalculatorService {
	
	private List valueList;
	private Properties properties;
	
	
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setValueList(List valueList) {
		this.valueList = valueList ;
	}
	
	public void setVarList(List valueList) {
		this.valueList = valueList ;
	}
	
	
	public List getTTT() {
		return null;
	}
	
	
	@Override
	public void listOutput() {
		// TODO Auto-generated method stub
		for( Object object : valueList ) {
			System.out.println(object.toString());
			System.out.println(object);
		}
	}

	public List getValueList() {
		return valueList;
	}

	public Properties getProperties() {
		return properties;
	}
	
	
	
}







