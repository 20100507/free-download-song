package org.bianqi.song.music.xiami;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class XiamiSecret {
	
	public static String str = "9hFx%22%_luD8%a56"
			                  +"1t%i2FF23.t145519"
			                  +"6t2aF21F6mh5%Efe3"
			                  +"apFm22212p_%5-632"
			                  +"9%mi%%%423k5E%bd5"
			                  +"31.55587%eE%5111A"
			                  +"2nEEE293y85Efe5%8"
			                  +"e22477F%4E-dd72.t"
			                  +"%%24_a36-ce8a";

	public static void main(String[] args) throws UnsupportedEncodingException {
		String location = XiamiSecret.getLocation(str);
		System.out.println(location);
	}
	

public static String getLocation(String location) throws UnsupportedEncodingException {
        int _local10;
        int _local2 = Integer.parseInt(location.substring(0, 1));
        String _local3 = location.substring(1, location.length());
        double _local4 = Math.floor(_local3.length() / _local2);
        int _local5 = _local3.length() % _local2;
        String[] _local6 = new String[_local2];
        int _local7 = 0;
        while (_local7 < _local5) {
            if (_local6[_local7] == null) {
                _local6[_local7] = "";
            }
            _local6[_local7] = _local3.substring((((int) _local4 + 1) * _local7),
                    (((int) _local4 + 1) * _local7) + ((int) _local4 + 1));
            _local7++;
        }
        _local7 = _local5;
        while (_local7 < _local2) {
            _local6[_local7] = _local3
                    .substring((((int) _local4 * (_local7 - _local5)) + (((int) _local4 + 1) * _local5)),
                            (((int) _local4 * (_local7 - _local5)) + (((int) _local4 + 1) * _local5))+(int) _local4);
            _local7++;
        }
        String _local8 = "";
        _local7 = 0;
        while (_local7 < ((String) _local6[0]).length()) {
            _local10 = 0;
            while (_local10 < _local6.length) {
                if (_local7 >= _local6[_local10].length()) {
                    break;
                }
                _local8 = (_local8 + _local6[_local10].charAt(_local7));
                _local10++;
            }
            _local7++;
        }
        _local8 = URLDecoder.decode(_local8, "utf8");
        String _local9 = "";
        _local7 = 0;
        while (_local7 < _local8.length()) {
            if (_local8.charAt(_local7) == '^'){
                _local9 = (_local9 + "0");
            } else {
                _local9 = (_local9 + _local8.charAt(_local7));
            };
            _local7++;
        }
        _local9 = _local9.replace("+", " ");
        return _local9;
    }
}














