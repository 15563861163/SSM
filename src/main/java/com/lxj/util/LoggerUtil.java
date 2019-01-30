package com.lxj.util;

import org.apache.log4j.Logger;

public class LoggerUtil {
	private Logger logger;
	
	/**
	 * ���췽������ʼ��Log4j����־����
	 */
	private LoggerUtil(org.apache.log4j.Logger log4jLogger) {
		logger = log4jLogger;
	}
 
	/**
	 * ��ȡ���������������ʼ��Logger����
	 * 
	 * @param Class
	 *            Class����
	 * @return Logger����
	 */
	public static LoggerUtil getLogger(@SuppressWarnings("rawtypes") Class classObject) {
		return new LoggerUtil(org.apache.log4j.Logger.getLogger(classObject));
	}
 
	/**
	 * ��ȡ������������������ʼ��Logger����
	 * 
	 * @param String
	 *            �����ַ���
	 * @return Logger����
	 */
	public static LoggerUtil getLogger(String loggerName) {
		return new LoggerUtil(org.apache.log4j.Logger.getLogger(loggerName));
	}
 
	public void debug(Object object) {
		logger.debug(object);
	}
 
	public void debug(Object object, Throwable e) {
		logger.debug(object, e);
	}
 
	public void info(Object object) {
		logger.info(object);
	}
 
	public void info(Object object, Throwable e) {
		logger.info(object, e);
	}
 
	public void warn(Object object) {
		logger.warn(object);
	}
 
	public void warn(Object object, Throwable e) {
		logger.warn(object, e);
	}
 
	public void error(Object object) {
		logger.error(object);
	}
 
	public void error(Object object, Throwable e) {
		logger.error(object, e);
	}
 
	public void fatal(Object object) {
		logger.fatal(object);
	}
 
	public String getName() {
		return logger.getName();
	}
 
	public org.apache.log4j.Logger getLog4jLogger() {
		return logger;
	}
 
	public boolean equals(LoggerUtil newLogger) {
		return logger.equals(newLogger.getLog4jLogger());
	}

}
