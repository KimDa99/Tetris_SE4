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
    private final Map<String, Integer> userKey = new ConcurrentHashMap<String, Integer>(); 
	
	private void userKey() {
		
    	if (userSettedKey == Boolean.FALSE) {
    		
    		userKey.clear();
    		
        	userKey.put("LEFT", defaultKey.getDefaultKey("LEFT"));
        	userKey.put("RIGHT", defaultKey.getDefaultKey("RIGHT"));
        	userKey.put("ROTATE", defaultKey.getDefaultKey("ROTATE"));
        	userKey.put("DROP", defaultKey.getDefaultKey("DROP"));
        	userKey.put("DOWN", defaultKey.getDefaultKey("DOWN"));
        	userSettedKey = Boolean.TRUE;
    	}
    }
	
	public int getUserKey(String KEY) {
		return userKey.get(KEY);
	}
	
	public void changeKey(String Key, int keyCode) {
		userSettedKey = Boolean.TRUE;
		userKey.replace(Key, keyCode);
	}

	

}
