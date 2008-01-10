/*
 *  Copyright 2007, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is free software: you can use it, redistribute it and/or modify
    it under the terms of version 3 of the GNU Affero General Public License 
    as published by the Free Software Foundation.

    docx4j is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License   
    along with docx4j.  If not, see <http://www.fsf.org/licensing/licenses/>.
    
 */


package org.docx4j.samples;

import java.io.File;

import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.io.SaveToZipFile;

/**
 * Creates a WordprocessingML document from scratch. 
 * 
 * @author Jason Harrop
 * @version 1.0
 */
public class CreateWordprocessingMLDocument {

	public static void main(String[] args) throws Exception {
//		DemoCore demoCore = new DemoCore();
//
//		File outputDocument = new File(demoCore.getTestRootPath()
//				+ "sample_output_zip.docx");
//
//		System.out.println( "Target to save: " + demoCore.getTestRootPath()
//				+ "sample_output_zip.docx" );
		
		System.out.println( "Creating package..");
		WordprocessingMLPackage p = WordprocessingMLPackage.createTestPackage();
		System.out.println( ".. done!");
		
		// Now save it 
		SaveToZipFile saver = new SaveToZipFile(p); 		
		saver.save("/home/jharrop/tmp/created-rels2.docx");		
				
	}
	
}
