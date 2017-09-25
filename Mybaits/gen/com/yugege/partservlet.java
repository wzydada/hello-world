package com.yugege;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class partservlet
 */
@WebServlet("/part.do")
@MultipartConfig(fileSizeThreshold=5-242-880,maxFileSize=20-971-520L,maxRequestSize
=41-943-040L)
public class partservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public partservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Part filePart = request.getPart("file");
    InputStream inputStream = filePart.getInputStream();
    OutputStream outputStream = new FileOutputStream("C:\\Program Files\\Notepad++\\"+filePart.getSubmittedFileName());
    int read;
    final byte[] bytes = new byte[1024];
    while((read = inputStream.read(bytes))!= -1) {
    	outputStream.write(bytes,0,read);
    }
    outputStream.flush();
    outputStream.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
