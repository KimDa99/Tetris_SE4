package setting;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import setting.DefaultSetting;
import setting.UserSetting;

/*
 * [x] userSetting���� ��������
 * [] userSetting�� Key�� ���������� Ȯ���ϱ�
 * [x] user�� input �ް� �� �ٲٱ�
 */


public class InputSetting {
       
    DefaultSetting defaultKey = new DefaultSetting();
    UserSetting userKey = new UserSetting();        
 
    public void setLeft(int keyCode) {
    	userKey.changeKey("LEFT", keyCode);
    }
    
    public void setRight(int keyCode) {
    	userKey.changeKey("RIGHT", keyCode);
    }

    public void setRotate(int keyCode) {
    	userKey.changeKey("ROTATE", keyCode);
    }

    public void setDrop(int keyCode) {
    	userKey.changeKey("DROP", keyCode);
    }    
    
    public void setDown(int keyCode) {
    	userKey.changeKey("Down", keyCode);
    }    

    
    
    public void resetKey() {
    	userKey.userSettedKey = Boolean.FALSE;
    }
    
    
    
    public int leftKey()	{
    	return userKey.getUserKey("LEFT");
    }
    
    public int rightKey()	{
    	return userKey.getUserKey("RIGHT");
    }
    
    public int rotateKey()	{
    	return userKey.getUserKey("ROTATE");
    }
    public int dropKey()	{
    	return userKey.getUserKey("DROP");
    }
    public int downKey() {
    	return userKey.getUserKey("DOWN");
    }
    
}