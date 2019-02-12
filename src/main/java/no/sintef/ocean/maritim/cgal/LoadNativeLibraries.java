/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.sintef.ocean.maritim.cgal;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author jon
 */
public class LoadNativeLibraries {

    private static boolean isLoaded = false;
    private static String OS = System.getProperty("os.name").toLowerCase();
    private static String sharedLibFileEnding;

    public static void load() {
        if (isLoaded) {
            return;
        }
        
        if (OS.equals("linux")) {
            sharedLibFileEnding = ".so";
        } else if (OS.equals("windows")) {
            sharedLibFileEnding = ".dll";
        } else {
            System.out.println("OS not supported");
            return;
        }

        File libFolder = new File("./lib");
        File[] libraryFiles = libFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File arg0, String arg1) {

                return arg1.endsWith(sharedLibFileEnding);
            }
        });
        
        for (File libFile : libraryFiles) {
            System.out.println("Loading " + libFile.getAbsolutePath());
            System.load(libFile.getAbsolutePath());
        }
        isLoaded = true;
    }
}
