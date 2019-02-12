/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.sintef.ocean.maritim.cgal;

import CGAL.examples.AABB_polyhedron_facet_intersection_example;
import CGAL.examples.AABB_triangle_3_example;

/**
 *
 * @author jon
 */
public class Tester {
    public static void main(String[] args) {
        LoadNativeLibraries.load();
        
        System.out.println("Test AABB_polyhedron_facet_intersection");
        AABB_polyhedron_facet_intersection_example.main(args);
        System.out.println("Test AABB_triangle_3");
        AABB_triangle_3_example.main(args);
    }
}
