package setting;
/* 
 * [] �� Ű�� �ٲ� �� �ִ� �Լ�
 * [] �� Ű�� �ٲ���� �� setted true�� �ٲٱ�
*/
import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import setting.DefaultSetting;

public class UserSetting {
	DefaultSetting defaultKey = new DefaultSetting();

    public boolean userSettedKey = Boolean.FALSE;
//    private final Map<String, Integer> userKey = new ConcurrentHashMap<String, Integer>(); 
	
	private int userKey(String Key) {
		final Map<String, Integer> userKey = new ConcurrentHashMap<String, Integer>(); 
		
        	userKey.put("LEFT", defaultKey.getDefaultKey("LEFT"));
        	userKey.put("RIGHT", defaultKey.getDefaultKey("RIGHT"));
        	userKey.put("ROTATE", defaultKey.getDefaultKey("ROTATE"));
        	userKey.put("DROP", defaultKey.getDefaultKey("DROP"));
        	userKey.put("DOWN", defaultKey.getDefaultKey("DOWN"));
        	userSettedKey = Boolean.TRUE;
        	
        	
        	int keyCode;
    	    
    		keyCode = userKey.get(Key);
    	    
    		return keyCode;
    }
	
	public int getUserKey(String KEY) {
		return userKey(KEY);
	}
	
	public void changeKey(String Key, int keyCode) {
		userSettedKey = Boolean.TRUE;
		userKey.userKey.replace(Key, keyCode);
	}

	

}
