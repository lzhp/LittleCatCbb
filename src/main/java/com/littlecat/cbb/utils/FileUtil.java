package com.littlecat.cbb.utils;

import java.io.File;
import java.io.FileOutputStream;

import com.littlecat.cbb.common.Consts;
import com.littlecat.cbb.exception.LittleCatException;

/**
 * 文件处理工具
 * 
 * @author amydady
 *
 */
public class FileUtil
{
	public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	public static final String FILE_SEPARATOR_WINDOWS = "\\";
	public static final String FILE_SEPARATOR_LINUX = "/";

	public static String formatPathSeprator(String path)
	{
		return path.replace(FILE_SEPARATOR_LINUX, FILE_SEPARATOR).replace(FILE_SEPARATOR_WINDOWS, FILE_SEPARATOR);
	}

	/**
	 * 上传文件
	 * 
	 * @param file
	 * @param filePath
	 * @param fileName
	 * @throws LittleCatException
	 */
	public static void uploadFile(byte[] file, String filePath, String fileName) throws LittleCatException
	{
		if (StringUtil.isEmpty(filePath))
		{
			throw new LittleCatException(Consts.ERROR_CODE_FILE_PATH_NULL_ERROR);
		}

		if (StringUtil.isEmpty(fileName))
		{
			throw new LittleCatException(Consts.ERROR_CODE_FILE_NAME_NULL_ERROR);
		}

		// 统一路径中的分割符
		filePath = formatPathSeprator(filePath);

		if (!filePath.endsWith(FILE_SEPARATOR))
		{
			filePath += FILE_SEPARATOR;
		}

		File dir = new File(filePath);

		if (!dir.exists())
		{
			if (!dir.mkdirs())
			{
				throw new LittleCatException(Consts.ERROR_CODE_FILE_CREATE_DIR_ERROR);
			}
		}

		FileOutputStream out;

		try
		{
			out = new FileOutputStream(filePath + fileName);
			out.write(file);
			out.flush();
			out.close();
		}
		catch (Exception e)
		{
			throw new LittleCatException(Consts.ERROR_CODE_FILE_ERROR, e);
		}
	}
}
