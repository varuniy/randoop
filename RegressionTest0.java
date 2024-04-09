import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = com.jstevh.viewer.DirManager.fileSeparator;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.jstevh.viewer.ClassViewer.file_separator = "hi!";
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.jstevh.viewer.ClassViewer.file_editor = "";
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = com.jstevh.viewer.SAXDirParser.getLocalBrowser();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.jstevh.viewer.ClassViewer.java_version = "";
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.jstevh.viewer.ClassViewer.currentDir = "hi!";
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.reflect.Member member0 = null;
        java.lang.reflect.Member[] memberArray1 = new java.lang.reflect.Member[] { member0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = com.jstevh.viewer.ClassInfo.getData(memberArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(memberArray1);
        org.junit.Assert.assertArrayEquals(memberArray1, new java.lang.reflect.Member[] { null });
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str0 = com.jstevh.viewer.ClassViewer.file_separator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hi!" + "'", str0, "hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.jstevh.tools.StringTools stringTools0 = new com.jstevh.tools.StringTools();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        com.jstevh.viewer.ClassViewer classViewer1 = new com.jstevh.viewer.ClassViewer();
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.add((java.awt.Component) classViewer1, (java.lang.Object) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: constraint must be a string (or null)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Event event6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = classViewer0.handleEvent(event6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(component5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        classViewer0.hide();
        java.awt.Image image2 = null;
        boolean boolean8 = classViewer0.imageUpdate(image2, 4, (int) 'a', (int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.jstevh.viewer.ClassViewer.operating_system = "hi!";
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        java.awt.PopupMenu popupMenu2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.add(popupMenu2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        classViewer0.setIgnoreRepaint(true);
        org.junit.Assert.assertNull(component5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        classViewer0.validate();
        java.awt.Event event3 = null;
        boolean boolean5 = classViewer0.keyDown(event3, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        classViewer0.validate();
        int int3 = classViewer0.getHeight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        boolean boolean0 = com.jstevh.viewer.ClassInfo.debug;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Point point3 = classViewer0.location();
        java.awt.PopupMenu popupMenu4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.add(popupMenu4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(point3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        // The following exception was thrown during execution in test generation
        try {
            classViewer4.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        classViewer0.setLocation((int) ' ', 1);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point10 = classViewer0.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        classViewer0.setLocation((int) ' ', 1);
        java.awt.Component component10 = classViewer0.getGlassPane();
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(component10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.Dimension dimension1 = classViewer0.size();
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.list(printWriter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        classViewer0.hide();
        java.awt.Component component3 = classViewer0.getComponent(0);
        boolean boolean4 = classViewer0.isFontSet();
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.Rectangle rectangle1 = classViewer0.bounds();
        java.awt.GraphicsConfiguration graphicsConfiguration2 = classViewer0.getGraphicsConfiguration();
        org.junit.Assert.assertNotNull(rectangle1);
        org.junit.Assert.assertNull(graphicsConfiguration2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        java.awt.Event event2 = null;
        boolean boolean4 = classViewer0.keyDown(event2, (-1));
        boolean boolean5 = classViewer0.isForegroundSet();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        classViewer0.removePropertyChangeListener("", propertyChangeListener7);
        com.jstevh.viewer.ClassViewer classViewer9 = new com.jstevh.viewer.ClassViewer();
        boolean boolean10 = classViewer9.isValid();
        com.jstevh.viewer.ClassViewer classViewer11 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener12 = null;
        classViewer11.removeMouseWheelListener(mouseWheelListener12);
        java.awt.Component component16 = classViewer11.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension17 = classViewer11.getMaximumSize();
        java.awt.Dimension dimension18 = classViewer9.getSize(dimension17);
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.setComponentZOrder((java.awt.Component) classViewer9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(component16);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNotNull(dimension18);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        com.jstevh.viewer.ClassViewer classViewer2 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener3 = null;
        classViewer2.removeMouseWheelListener(mouseWheelListener3);
        java.awt.Component component7 = classViewer2.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension8 = classViewer2.getMaximumSize();
        java.awt.Dimension dimension9 = classViewer0.getSize(dimension8);
        com.jstevh.viewer.ClassViewer classViewer10 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        classViewer10.removeMouseWheelListener(mouseWheelListener11);
        boolean boolean13 = classViewer10.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer14 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener15 = null;
        classViewer14.removeMouseWheelListener(mouseWheelListener15);
        boolean boolean17 = classViewer14.isValidateRoot();
        classViewer14.hide();
        java.awt.Component component19 = classViewer10.add((java.awt.Component) classViewer14);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = classViewer10.createImage(imageProducer20);
        com.jstevh.viewer.ClassViewer classViewer22 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener23 = null;
        classViewer22.removeMouseWheelListener(mouseWheelListener23);
        boolean boolean25 = classViewer22.isValidateRoot();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        classViewer22.addPropertyChangeListener("", propertyChangeListener27);
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.add((java.awt.Component) classViewer10, (java.lang.Object) classViewer22, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: constraint must be a string (or null)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.FocusTraversalPolicy focusTraversalPolicy10 = null;
        classViewer0.setFocusTraversalPolicy(focusTraversalPolicy10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        classViewer0.destroy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.Event event10 = null;
        boolean boolean12 = component9.keyUp(event10, (int) (byte) 1);
        java.awt.Color color13 = null;
        component9.setForeground(color13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        boolean boolean4 = classViewer0.isMaximumSizeSet();
        java.awt.PopupMenu popupMenu5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.add(popupMenu5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str0 = com.jstevh.viewer.DirManager.defaultXML;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>" + "'", str0, "<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.jstevh.viewer.SAXDirParser sAXDirParser0 = new com.jstevh.viewer.SAXDirParser();
        sAXDirParser0.processingInstruction("", "<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.jstevh.viewer.SAXDirParser sAXDirParser0 = new com.jstevh.viewer.SAXDirParser();
        sAXDirParser0.skippedEntity("hi!");
        java.lang.String str3 = sAXDirParser0.webData;
        org.xml.sax.Attributes attributes7 = null;
        sAXDirParser0.startElement("", "", "", attributes7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        classViewer0.invalidate();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        classViewer4.invalidate();
        classViewer0.setContentPane((java.awt.Container) classViewer4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.jstevh.viewer.SAXDirParser sAXDirParser0 = new com.jstevh.viewer.SAXDirParser();
        sAXDirParser0.skippedEntity("hi!");
        java.lang.String str3 = sAXDirParser0.webData;
        sAXDirParser0.endElement("", "", "");
        org.xml.sax.SAXParseException sAXParseException8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sAXDirParser0.fatalError(sAXParseException8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.Dimension dimension1 = classViewer0.size();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        classViewer0.addPropertyChangeListener("hi!", propertyChangeListener3);
        classViewer0.firePropertyChange("<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>", (short) 100, (short) 1);
        org.junit.Assert.assertNotNull(dimension1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str0 = com.jstevh.viewer.ClassViewer.VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "5.0.5b" + "'", str0, "5.0.5b");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        classViewer0.validate();
        classViewer0.firePropertyChange("<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>", (long) (byte) -1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        int int0 = com.jstevh.viewer.ClassInfo.NO_INHERITED_METHODS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        classViewer8.removeMouseWheelListener(mouseWheelListener9);
        boolean boolean11 = classViewer8.isValidateRoot();
        classViewer8.hide();
        java.awt.Component component13 = classViewer4.add((java.awt.Component) classViewer8);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = classViewer4.createImage(imageProducer14);
        com.jstevh.viewer.ClassViewer classViewer18 = new com.jstevh.viewer.ClassViewer();
        classViewer18.hide();
        java.awt.Dimension dimension20 = classViewer18.getPreferredSize();
        int int21 = classViewer0.checkImage(image15, 4, (int) (short) 10, (java.awt.image.ImageObserver) classViewer18);
        java.awt.Graphics graphics22 = null;
        classViewer18.paint(graphics22);
        com.jstevh.viewer.ClassViewer classViewer24 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener25 = null;
        classViewer24.removeMouseWheelListener(mouseWheelListener25);
        boolean boolean27 = classViewer24.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer28 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener29 = null;
        classViewer28.removeMouseWheelListener(mouseWheelListener29);
        boolean boolean31 = classViewer28.isValidateRoot();
        classViewer28.hide();
        java.awt.Component component33 = classViewer24.add((java.awt.Component) classViewer28);
        classViewer18.remove((java.awt.Component) classViewer28);
        java.awt.image.VolatileImage volatileImage37 = classViewer28.createVolatileImage((int) (byte) 0, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(component33);
        org.junit.Assert.assertNull(volatileImage37);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean3 = classViewer0.contains(4, (int) (byte) 100);
        java.lang.String str4 = classViewer0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "panel0" + "'", str4, "panel0");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        classViewer8.removeMouseWheelListener(mouseWheelListener9);
        boolean boolean11 = classViewer8.isValidateRoot();
        classViewer8.hide();
        java.awt.Component component13 = classViewer4.add((java.awt.Component) classViewer8);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = classViewer4.createImage(imageProducer14);
        com.jstevh.viewer.ClassViewer classViewer16 = new com.jstevh.viewer.ClassViewer();
        boolean boolean17 = classViewer16.isValid();
        classViewer16.validate();
        int int19 = classViewer0.checkImage(image15, (java.awt.image.ImageObserver) classViewer16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.jstevh.viewer.ClassInfo.debug = true;
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        classViewer0.addPropertyChangeListener("", propertyChangeListener5);
        java.awt.Component[] componentArray7 = classViewer0.getComponents();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.play(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(componentArray7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.Dimension dimension1 = classViewer0.size();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        classViewer0.addPropertyChangeListener("hi!", propertyChangeListener3);
        java.awt.Event event5 = null;
        com.jstevh.viewer.ClassViewer classViewer6 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        classViewer6.removeMouseWheelListener(mouseWheelListener7);
        int int9 = classViewer6.getHeight();
        boolean boolean10 = classViewer6.isMaximumSizeSet();
        classViewer6.transferFocus();
        java.awt.Graphics graphics12 = null;
        classViewer6.printComponents(graphics12);
        java.awt.event.ContainerListener[] containerListenerArray14 = classViewer6.getContainerListeners();
        boolean boolean15 = classViewer0.lostFocus(event5, (java.lang.Object) classViewer6);
        java.awt.Event event16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = classViewer0.handleEvent(event16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(containerListenerArray14);
        org.junit.Assert.assertArrayEquals(containerListenerArray14, new java.awt.event.ContainerListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.Graphics graphics10 = null;
        classViewer4.print(graphics10);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point12 = classViewer4.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        java.awt.Event event2 = null;
        boolean boolean4 = classViewer0.keyDown(event2, (-1));
        java.awt.peer.ComponentPeer componentPeer5 = classViewer0.getPeer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(componentPeer5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        classViewer4.enableInputMethods(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.jstevh.viewer.SAXDirParser sAXDirParser0 = new com.jstevh.viewer.SAXDirParser();
        sAXDirParser0.endDocument();
        java.lang.String str2 = sAXDirParser0.webData;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.dnd.DropTarget dropTarget3 = null;
        classViewer0.setDropTarget(dropTarget3);
        java.lang.Object obj5 = classViewer0.getTreeLock();
        com.jstevh.viewer.ClassViewer classViewer6 = new com.jstevh.viewer.ClassViewer();
        classViewer6.hide();
        java.awt.Dimension dimension8 = classViewer6.getPreferredSize();
        classViewer0.setPreferredSize(dimension8);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(dimension8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        classViewer0.hide();
        java.awt.Dimension dimension2 = classViewer0.getPreferredSize();
        java.awt.Event event3 = null;
        boolean boolean5 = classViewer0.action(event3, (java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(dimension2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Point point3 = classViewer0.location();
        boolean boolean4 = classViewer0.isMaximumSizeSet();
        boolean boolean5 = classViewer0.isLightweight();
        org.junit.Assert.assertNotNull(point3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.jstevh.viewer.DirManager.fileSeparator = "";
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.jstevh.viewer.SAXDirParser sAXDirParser0 = new com.jstevh.viewer.SAXDirParser();
        sAXDirParser0.skippedEntity("hi!");
        java.lang.String str3 = sAXDirParser0.webData;
        sAXDirParser0.endElement("", "", "");
        org.xml.sax.InputSource inputSource10 = sAXDirParser0.resolveEntity("5.0.5b", "<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(inputSource10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Point point3 = classViewer0.location();
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.list(printWriter4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(point3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        boolean boolean5 = classViewer4.isValid();
        java.awt.Event event6 = null;
        boolean boolean8 = classViewer4.keyDown(event6, (-1));
        boolean boolean9 = classViewer4.isForegroundSet();
        classViewer0.setContentPane((java.awt.Container) classViewer4);
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        classViewer4.addMouseWheelListener(mouseWheelListener11);
        java.io.PrintStream printStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            classViewer4.list(printStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        classViewer0.hide();
        java.awt.Component component3 = classViewer0.getComponent(0);
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        int int7 = classViewer4.getHeight();
        boolean boolean8 = classViewer4.isMaximumSizeSet();
        classViewer4.transferFocus();
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.add((java.awt.Component) classViewer4, (java.lang.Object) 0.0d, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        boolean boolean5 = classViewer4.isValid();
        java.awt.Event event6 = null;
        boolean boolean8 = classViewer4.keyDown(event6, (-1));
        boolean boolean9 = classViewer4.isForegroundSet();
        classViewer0.setContentPane((java.awt.Container) classViewer4);
        classViewer4.repaint(4, 10, (int) (byte) 100, (int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        classViewer4.removePropertyChangeListener("<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>", propertyChangeListener17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        classViewer0.setLocation((int) ' ', 1);
        java.awt.event.KeyListener[] keyListenerArray10 = classViewer0.getKeyListeners();
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(keyListenerArray10);
        org.junit.Assert.assertArrayEquals(keyListenerArray10, new java.awt.event.KeyListener[] {});
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.Rectangle rectangle1 = classViewer0.bounds();
        classViewer0.enable(false);
        classViewer0.repaint((long) 32);
        org.junit.Assert.assertNotNull(rectangle1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        float float0 = java.awt.Component.TOP_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str0 = com.jstevh.viewer.DirManager.currentDir;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        classViewer8.removeMouseWheelListener(mouseWheelListener9);
        boolean boolean11 = classViewer8.isValidateRoot();
        classViewer8.hide();
        java.awt.Component component13 = classViewer4.add((java.awt.Component) classViewer8);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = classViewer4.createImage(imageProducer14);
        com.jstevh.viewer.ClassViewer classViewer18 = new com.jstevh.viewer.ClassViewer();
        classViewer18.hide();
        java.awt.Dimension dimension20 = classViewer18.getPreferredSize();
        int int21 = classViewer0.checkImage(image15, 4, (int) (short) 10, (java.awt.image.ImageObserver) classViewer18);
        java.awt.Component component22 = classViewer0.getGlassPane();
        java.awt.event.HierarchyListener hierarchyListener23 = null;
        classViewer0.removeHierarchyListener(hierarchyListener23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(component22);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        classViewer0.setLocation((int) ' ', 1);
        classViewer0.repaint((long) 10);
        boolean boolean12 = classViewer0.isDisplayable();
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        classViewer0.addPropertyChangeListener("", propertyChangeListener5);
        java.awt.Point point7 = classViewer0.getMousePosition();
        java.awt.event.MouseMotionListener mouseMotionListener8 = null;
        classViewer0.removeMouseMotionListener(mouseMotionListener8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(point7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.Dimension dimension1 = classViewer0.size();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        classViewer0.addPropertyChangeListener("hi!", propertyChangeListener3);
        java.awt.Event event5 = null;
        com.jstevh.viewer.ClassViewer classViewer6 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        classViewer6.removeMouseWheelListener(mouseWheelListener7);
        int int9 = classViewer6.getHeight();
        boolean boolean10 = classViewer6.isMaximumSizeSet();
        classViewer6.transferFocus();
        java.awt.Graphics graphics12 = null;
        classViewer6.printComponents(graphics12);
        java.awt.event.ContainerListener[] containerListenerArray14 = classViewer6.getContainerListeners();
        boolean boolean15 = classViewer0.lostFocus(event5, (java.lang.Object) classViewer6);
        boolean boolean16 = classViewer6.isFontSet();
        java.awt.event.MouseMotionListener mouseMotionListener17 = null;
        classViewer6.addMouseMotionListener(mouseMotionListener17);
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(containerListenerArray14);
        org.junit.Assert.assertArrayEquals(containerListenerArray14, new java.awt.event.ContainerListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.jstevh.viewer.ClassViewer.mainRun = false;
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        java.awt.event.ComponentListener componentListener4 = null;
        classViewer0.removeComponentListener(componentListener4);
        classViewer0.setFocusTraversalPolicyProvider(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = classViewer0.createImage(imageProducer10);
        java.awt.Rectangle rectangle12 = classViewer0.getBounds();
        classViewer0.init();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNotNull(rectangle12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        java.awt.Event event2 = null;
        boolean boolean4 = classViewer0.keyDown(event2, (-1));
        boolean boolean5 = classViewer0.isBackgroundSet();
        com.jstevh.viewer.ClassViewer classViewer6 = new com.jstevh.viewer.ClassViewer();
        java.awt.Rectangle rectangle7 = classViewer6.bounds();
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        classViewer8.removeMouseWheelListener(mouseWheelListener9);
        java.awt.Point point11 = classViewer8.location();
        java.awt.Point point12 = classViewer6.getLocation(point11);
        java.awt.Component component13 = classViewer0.findComponentAt(point12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNull(component13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        boolean boolean0 = com.jstevh.viewer.ClassViewer.mainRun;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        classViewer0.addPropertyChangeListener("", propertyChangeListener5);
        classViewer0.resize(10, (int) (short) -1);
        boolean boolean12 = classViewer0.contains((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = classViewer0.createImage(imageProducer10);
        classViewer0.hide();
        java.awt.event.MouseWheelListener mouseWheelListener13 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(image11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        java.awt.Event event2 = null;
        boolean boolean4 = classViewer0.keyDown(event2, (-1));
        java.awt.Font font5 = null;
        classViewer0.setFont(font5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        java.awt.Event event7 = null;
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        classViewer8.hide();
        java.awt.Dimension dimension10 = classViewer8.getPreferredSize();
        boolean boolean11 = classViewer0.gotFocus(event7, (java.lang.Object) classViewer8);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        classViewer0.addHierarchyBoundsListener(hierarchyBoundsListener12);
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str0 = com.jstevh.viewer.ClassViewer.currentDir;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hi!" + "'", str0, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        classViewer0.nextFocus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        component9.enableInputMethods(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        java.awt.Event event7 = null;
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        classViewer8.hide();
        java.awt.Dimension dimension10 = classViewer8.getPreferredSize();
        boolean boolean11 = classViewer0.gotFocus(event7, (java.lang.Object) classViewer8);
        java.awt.Font font12 = classViewer8.getFont();
        java.awt.image.VolatileImage volatileImage15 = classViewer8.createVolatileImage((int) (short) -1, (int) '4');
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertNull(volatileImage15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        java.awt.Event event2 = null;
        boolean boolean4 = classViewer0.keyDown(event2, (-1));
        boolean boolean5 = classViewer0.isForegroundSet();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        classViewer0.removePropertyChangeListener("", propertyChangeListener7);
        classViewer0.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        classViewer0.invalidate();
        java.awt.Component component6 = classViewer0.findComponentAt(10, (int) (short) 0);
        java.awt.event.KeyListener keyListener7 = null;
        classViewer0.addKeyListener(keyListener7);
        float float9 = classViewer0.getAlignmentY();
        org.junit.Assert.assertNull(component6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String str0 = com.jstevh.viewer.SAXDirParser.lineNumberParameter();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "+" + "'", str0, "+");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Point point3 = classViewer0.location();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray4 = classViewer0.getMouseMotionListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        classViewer0.removeHierarchyBoundsListener(hierarchyBoundsListener5);
        org.junit.Assert.assertNotNull(point3);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray4);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray4, new java.awt.event.MouseMotionListener[] {});
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        java.awt.Event event7 = null;
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        classViewer8.hide();
        java.awt.Dimension dimension10 = classViewer8.getPreferredSize();
        boolean boolean11 = classViewer0.gotFocus(event7, (java.lang.Object) classViewer8);
        boolean boolean12 = classViewer8.isEnabled();
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Point point3 = classViewer0.location();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.Dimension dimension5 = classViewer4.size();
        java.awt.Dimension dimension6 = classViewer0.getSize(dimension5);
        com.jstevh.viewer.ClassViewer classViewer7 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener8 = null;
        classViewer7.removeMouseWheelListener(mouseWheelListener8);
        boolean boolean10 = classViewer7.isValidateRoot();
        classViewer7.transferFocusBackward();
        com.jstevh.viewer.ClassViewer classViewer12 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener13 = null;
        classViewer12.removeMouseWheelListener(mouseWheelListener13);
        java.awt.Component component17 = classViewer12.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension18 = classViewer12.getMaximumSize();
        java.awt.image.ColorModel colorModel19 = classViewer12.getColorModel();
        classViewer12.repaint((int) (byte) -1, (int) (byte) 0, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.add((java.awt.Component) classViewer7, (java.lang.Object) classViewer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: constraint must be a string (or null)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(point3);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNotNull(colorModel19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        boolean boolean5 = classViewer4.isValid();
        java.awt.Event event6 = null;
        boolean boolean8 = classViewer4.keyDown(event6, (-1));
        boolean boolean9 = classViewer4.isForegroundSet();
        classViewer0.setContentPane((java.awt.Container) classViewer4);
        classViewer4.setFocusTraversalPolicyProvider(false);
        java.awt.Event event13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = classViewer4.postEvent(event13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Point point3 = classViewer0.location();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray4 = classViewer0.getMouseMotionListeners();
        java.awt.Event event5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = classViewer0.postEvent(event5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(point3);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray4);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray4, new java.awt.event.MouseMotionListener[] {});
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        java.awt.Event event7 = null;
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        classViewer8.hide();
        java.awt.Dimension dimension10 = classViewer8.getPreferredSize();
        boolean boolean11 = classViewer0.gotFocus(event7, (java.lang.Object) classViewer8);
        java.awt.Font font12 = classViewer8.getFont();
        com.jstevh.viewer.ClassViewer classViewer13 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        classViewer13.removeMouseWheelListener(mouseWheelListener14);
        classViewer13.invalidate();
        java.awt.Component component19 = classViewer13.findComponentAt(10, (int) (short) 0);
        java.awt.event.KeyListener keyListener20 = null;
        classViewer13.addKeyListener(keyListener20);
        com.jstevh.viewer.ClassViewer classViewer22 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener23 = null;
        classViewer22.removeMouseWheelListener(mouseWheelListener23);
        boolean boolean25 = classViewer22.isValidateRoot();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        classViewer22.addPropertyChangeListener("", propertyChangeListener27);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        classViewer22.removePropertyChangeListener("panel0", propertyChangeListener30);
        // The following exception was thrown during execution in test generation
        try {
            classViewer8.add((java.awt.Component) classViewer13, (java.lang.Object) classViewer22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertNull(component19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        classViewer0.setLocation((int) ' ', 1);
        classViewer0.repaint((long) 10);
        java.awt.Point point12 = classViewer0.getLocation();
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(point12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.jstevh.viewer.SAXDirParser sAXDirParser0 = new com.jstevh.viewer.SAXDirParser();
        sAXDirParser0.skippedEntity("hi!");
        char[] charArray3 = new char[] {};
        sAXDirParser0.characters(charArray3, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Point point3 = classViewer0.location();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray4 = classViewer0.getMouseMotionListeners();
        javax.swing.JMenuBar jMenuBar5 = classViewer0.getJMenuBar();
        // The following exception was thrown during execution in test generation
        try {
            jMenuBar5.reshape((int) (byte) 1, (int) 'a', (-1), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(point3);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray4);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray4, new java.awt.event.MouseMotionListener[] {});
        org.junit.Assert.assertNull(jMenuBar5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.jstevh.tools.StringList stringList0 = new com.jstevh.tools.StringList();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        classViewer8.removeMouseWheelListener(mouseWheelListener9);
        boolean boolean11 = classViewer8.isValidateRoot();
        classViewer8.hide();
        java.awt.Component component13 = classViewer4.add((java.awt.Component) classViewer8);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = classViewer4.createImage(imageProducer14);
        com.jstevh.viewer.ClassViewer classViewer18 = new com.jstevh.viewer.ClassViewer();
        classViewer18.hide();
        java.awt.Dimension dimension20 = classViewer18.getPreferredSize();
        int int21 = classViewer0.checkImage(image15, 4, (int) (short) 10, (java.awt.image.ImageObserver) classViewer18);
        java.awt.Component component22 = classViewer0.getGlassPane();
        component22.transferFocusUpCycle();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(component22);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.im.InputContext inputContext3 = classViewer0.getInputContext();
        org.junit.Assert.assertNull(inputContext3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Image image11 = classViewer4.getImage(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        classViewer0.hide();
        java.awt.Component component3 = classViewer0.getComponent(0);
        classViewer0.stop();
        org.junit.Assert.assertNotNull(component3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.event.MouseListener[] mouseListenerArray10 = component9.getMouseListeners();
        component9.requestFocus();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(mouseListenerArray10);
        org.junit.Assert.assertArrayEquals(mouseListenerArray10, new java.awt.event.MouseListener[] {});
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        classViewer0.setLocation((int) ' ', 1);
        java.awt.Graphics graphics10 = null;
        classViewer0.paint(graphics10);
        java.util.Locale locale12 = null;
        classViewer0.setLocale(locale12);
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = classViewer0.createImage(imageProducer10);
        java.awt.Rectangle rectangle12 = classViewer0.getBounds();
        java.awt.Component component15 = classViewer0.getComponentAt((int) (byte) 10, 32);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray16 = component15.getHierarchyBoundsListeners();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNotNull(rectangle12);
        org.junit.Assert.assertNull(component15);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        classViewer4.repaint((long) 2, (int) (short) 1, (int) (byte) 10, 4, (int) '#');
        java.awt.Dimension dimension16 = classViewer4.getMaximumSize();
        classViewer4.setEnabled(true);
        classViewer4.invalidate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(dimension16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        boolean boolean5 = classViewer4.isValid();
        java.awt.Event event6 = null;
        boolean boolean8 = classViewer4.keyDown(event6, (-1));
        boolean boolean9 = classViewer4.isForegroundSet();
        classViewer0.setContentPane((java.awt.Container) classViewer4);
        classViewer4.setFocusTraversalPolicyProvider(false);
        java.awt.Container container13 = classViewer4.getParent();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        container13.addMouseWheelListener(mouseWheelListener14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(container13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        java.awt.Event event7 = null;
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        classViewer8.hide();
        java.awt.Dimension dimension10 = classViewer8.getPreferredSize();
        boolean boolean11 = classViewer0.gotFocus(event7, (java.lang.Object) classViewer8);
        java.awt.Color color12 = null;
        classViewer8.setForeground(color12);
        java.awt.dnd.DropTarget dropTarget14 = null;
        classViewer8.setDropTarget(dropTarget14);
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        boolean boolean4 = classViewer0.isMaximumSizeSet();
        classViewer0.transferFocus();
        java.awt.Graphics graphics6 = null;
        classViewer0.printComponents(graphics6);
        java.awt.event.ContainerListener[] containerListenerArray8 = classViewer0.getContainerListeners();
        boolean boolean11 = classViewer0.inside(2, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(containerListenerArray8);
        org.junit.Assert.assertArrayEquals(containerListenerArray8, new java.awt.event.ContainerListener[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = classViewer0.createImage(imageProducer10);
        java.awt.Rectangle rectangle12 = classViewer0.getBounds();
        java.awt.Dimension dimension13 = classViewer0.getPreferredSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNotNull(rectangle12);
        org.junit.Assert.assertNotNull(dimension13);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        java.awt.Event event2 = null;
        boolean boolean4 = classViewer0.keyDown(event2, (-1));
        boolean boolean5 = classViewer0.isBackgroundSet();
        java.awt.Event event6 = null;
        boolean boolean8 = classViewer0.lostFocus(event6, (java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        classViewer0.hide();
        java.awt.Container container5 = classViewer0.getContentPane();
        java.awt.event.HierarchyListener hierarchyListener6 = null;
        container5.addHierarchyListener(hierarchyListener6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(container5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        classViewer0.setLocation((int) ' ', 1);
        java.awt.Insets insets10 = classViewer0.insets();
        java.awt.Dimension dimension11 = classViewer0.getMinimumSize();
        java.awt.LayoutManager layoutManager12 = classViewer0.getLayout();
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(insets10);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(layoutManager12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        classViewer0.validate();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        classViewer0.removePropertyChangeListener(propertyChangeListener3);
        java.awt.Rectangle rectangle5 = classViewer0.bounds();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(rectangle5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        java.awt.image.ColorModel colorModel7 = classViewer0.getColorModel();
        java.awt.Event event8 = null;
        boolean boolean11 = classViewer0.mouseExit(event8, 0, (int) 'a');
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(colorModel7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        classViewer0.hide();
        com.jstevh.viewer.ClassViewer classViewer5 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        classViewer5.removeMouseWheelListener(mouseWheelListener6);
        java.awt.Point point8 = classViewer5.location();
        java.awt.Component component9 = classViewer0.getComponentAt(point8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = component9.isEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNull(component9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = classViewer0.createImage(imageProducer10);
        classViewer0.hide();
        com.jstevh.viewer.ClassViewer classViewer13 = new com.jstevh.viewer.ClassViewer();
        boolean boolean14 = classViewer13.isValid();
        boolean boolean15 = classViewer13.getFocusTraversalKeysEnabled();
        java.awt.Component component17 = classViewer0.add((java.awt.Component) classViewer13, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(component17);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        classViewer0.repaint();
        java.lang.Class<?> wildcardClass5 = classViewer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Point point3 = classViewer0.location();
        boolean boolean4 = classViewer0.isMaximumSizeSet();
        java.awt.Font font5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.FontMetrics fontMetrics6 = classViewer0.getFontMetrics(font5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(point3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.jstevh.viewer.ClassInfo.debug = false;
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        java.awt.Event event2 = null;
        boolean boolean4 = classViewer0.keyDown(event2, (-1));
        boolean boolean5 = classViewer0.isBackgroundSet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = classViewer0.removePackages("+");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        classViewer0.setLocation((int) ' ', 1);
        java.awt.Graphics graphics10 = null;
        classViewer0.paint(graphics10);
        classViewer0.transferFocusDownCycle();
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        java.awt.image.ColorModel colorModel7 = classViewer0.getColorModel();
        classViewer0.repaint((int) (byte) -1, (int) (byte) 0, 0, (int) ' ');
        java.awt.Graphics graphics13 = null;
        classViewer0.printComponents(graphics13);
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(colorModel7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        classViewer0.repaint();
        java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
        classViewer0.setFocusTraversalPolicy(focusTraversalPolicy5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = classViewer0.createImage(imageProducer10);
        java.awt.peer.ComponentPeer componentPeer12 = classViewer0.getPeer();
        java.awt.Point point13 = classViewer0.getLocation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNull(componentPeer12);
        org.junit.Assert.assertNotNull(point13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = classViewer0.createImage(imageProducer10);
        boolean boolean12 = classViewer0.isFontSet();
        com.jstevh.viewer.ClassViewer classViewer13 = new com.jstevh.viewer.ClassViewer();
        boolean boolean14 = classViewer13.isValid();
        com.jstevh.viewer.ClassViewer classViewer15 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener16 = null;
        classViewer15.removeMouseWheelListener(mouseWheelListener16);
        java.awt.Component component20 = classViewer15.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension21 = classViewer15.getMaximumSize();
        java.awt.Dimension dimension22 = classViewer13.getSize(dimension21);
        com.jstevh.viewer.ClassViewer classViewer23 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener24 = null;
        classViewer23.removeMouseWheelListener(mouseWheelListener24);
        boolean boolean26 = classViewer23.isValidateRoot();
        classViewer23.hide();
        java.awt.event.MouseWheelListener mouseWheelListener28 = null;
        classViewer23.addMouseWheelListener(mouseWheelListener28);
        java.awt.Color color30 = classViewer23.getForeground();
        classViewer13.setBackground(color30);
        classViewer0.setForeground(color30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(component20);
        org.junit.Assert.assertNotNull(dimension21);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(color30);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        classViewer0.hide();
        java.awt.Dimension dimension2 = classViewer0.getPreferredSize();
        classViewer0.transferFocusDownCycle();
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.applet.AudioClip audioClip5 = classViewer0.getAudioClip(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        classViewer0.addPropertyChangeListener("", propertyChangeListener5);
        java.awt.Component[] componentArray7 = classViewer0.getComponents();
        classViewer0.hide();
        java.awt.Color color9 = classViewer0.getBackground();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        classViewer0.addPropertyChangeListener("", propertyChangeListener5);
        java.awt.Component[] componentArray7 = classViewer0.getComponents();
        classViewer0.hide();
        java.awt.Component[] componentArray9 = classViewer0.getComponents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(componentArray9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.jstevh.viewer.DirManager.defaultXML = "panel0";
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        boolean boolean2 = classViewer0.getFocusTraversalKeysEnabled();
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet4 = classViewer0.getFocusTraversalKeys(2);
        com.jstevh.viewer.ClassViewer classViewer5 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        classViewer5.removeMouseWheelListener(mouseWheelListener6);
        boolean boolean8 = classViewer5.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer9 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener10 = null;
        classViewer9.removeMouseWheelListener(mouseWheelListener10);
        boolean boolean12 = classViewer9.isValidateRoot();
        classViewer9.hide();
        java.awt.Component component14 = classViewer5.add((java.awt.Component) classViewer9);
        java.awt.image.ImageProducer imageProducer15 = null;
        java.awt.Image image16 = classViewer5.createImage(imageProducer15);
        boolean boolean22 = classViewer0.imageUpdate(image16, 100, (int) '4', (-1), 2, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNotNull(image16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int int0 = com.jstevh.viewer.ClassViewer.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2013 + "'", int0 == 2013);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.jstevh.viewer.ClassViewer.java_version = "+";
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Point point3 = classViewer0.location();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray4 = classViewer0.getMouseMotionListeners();
        javax.swing.JMenuBar jMenuBar5 = classViewer0.getJMenuBar();
        java.awt.Cursor cursor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jMenuBar5.setCursor(cursor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(point3);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray4);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray4, new java.awt.event.MouseMotionListener[] {});
        org.junit.Assert.assertNull(jMenuBar5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.jstevh.viewer.SAXDirParser sAXDirParser0 = new com.jstevh.viewer.SAXDirParser();
        sAXDirParser0.skippedEntity("hi!");
        java.lang.String str3 = sAXDirParser0.webData;
        sAXDirParser0.startDocument();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.jstevh.viewer.SAXDirParser sAXDirParser0 = new com.jstevh.viewer.SAXDirParser();
        sAXDirParser0.endDocument();
        org.xml.sax.SAXParseException sAXParseException2 = null;
        sAXDirParser0.warning(sAXParseException2);
        sAXDirParser0.startPrefixMapping("5.0.5b", "hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        boolean boolean0 = com.jstevh.viewer.SAXDirParser.acceptsLineNumber();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        classViewer0.hide();
        java.awt.image.ImageProducer imageProducer5 = null;
        java.awt.Image image6 = classViewer0.createImage(imageProducer5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(image6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        int int4 = classViewer0.getY();
        java.awt.image.VolatileImage volatileImage7 = classViewer0.createVolatileImage(10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(volatileImage7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        classViewer4.repaint((long) 2, (int) (short) 1, (int) (byte) 10, 4, (int) '#');
        java.awt.Dimension dimension16 = classViewer4.getMaximumSize();
        boolean boolean17 = classViewer4.getIgnoreRepaint();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        classViewer0.hide();
        com.jstevh.viewer.ClassViewer classViewer5 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        classViewer5.removeMouseWheelListener(mouseWheelListener6);
        java.awt.Point point8 = classViewer5.location();
        java.awt.Component component9 = classViewer0.getComponentAt(point8);
        java.awt.event.ContainerListener[] containerListenerArray10 = classViewer0.getContainerListeners();
        java.awt.AWTKeyStroke[] aWTKeyStrokeArray12 = new java.awt.AWTKeyStroke[] {};
        java.util.LinkedHashSet<java.awt.AWTKeyStroke> aWTKeyStrokeSet13 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>) aWTKeyStrokeSet13, aWTKeyStrokeArray12);
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.setFocusTraversalKeys((int) (byte) -1, (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNull(component9);
        org.junit.Assert.assertNotNull(containerListenerArray10);
        org.junit.Assert.assertArrayEquals(containerListenerArray10, new java.awt.event.ContainerListener[] {});
        org.junit.Assert.assertNotNull(aWTKeyStrokeArray12);
        org.junit.Assert.assertArrayEquals(aWTKeyStrokeArray12, new java.awt.AWTKeyStroke[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        int int4 = classViewer0.getY();
        classViewer0.firePropertyChange("<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>", (byte) 10, (byte) 0);
        javax.swing.JRootPane jRootPane9 = classViewer0.getRootPane();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(jRootPane9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.jstevh.viewer.ClassViewer.currentDir = "";
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        classViewer8.removeMouseWheelListener(mouseWheelListener9);
        boolean boolean11 = classViewer8.isValidateRoot();
        classViewer8.hide();
        java.awt.Component component13 = classViewer4.add((java.awt.Component) classViewer8);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = classViewer4.createImage(imageProducer14);
        com.jstevh.viewer.ClassViewer classViewer18 = new com.jstevh.viewer.ClassViewer();
        classViewer18.hide();
        java.awt.Dimension dimension20 = classViewer18.getPreferredSize();
        int int21 = classViewer0.checkImage(image15, 4, (int) (short) 10, (java.awt.image.ImageObserver) classViewer18);
        java.awt.Graphics graphics22 = null;
        classViewer18.paint(graphics22);
        int int24 = classViewer18.getComponentCount();
        classViewer18.resize((int) (short) 1, (int) (short) 10);
        boolean boolean28 = classViewer18.isBackgroundSet();
        java.awt.event.FocusListener[] focusListenerArray29 = classViewer18.getFocusListeners();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(focusListenerArray29);
        org.junit.Assert.assertArrayEquals(focusListenerArray29, new java.awt.event.FocusListener[] {});
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.dnd.DropTarget dropTarget3 = null;
        classViewer0.setDropTarget(dropTarget3);
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Image image6 = classViewer0.getImage(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        boolean boolean4 = classViewer0.requestFocusInWindow();
        java.awt.Graphics graphics5 = null;
        classViewer0.paintAll(graphics5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        classViewer0.invalidate();
        java.awt.event.MouseMotionListener mouseMotionListener4 = null;
        classViewer0.removeMouseMotionListener(mouseMotionListener4);
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.showStatus("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        boolean boolean5 = classViewer4.isValid();
        java.awt.Event event6 = null;
        boolean boolean8 = classViewer4.keyDown(event6, (-1));
        boolean boolean9 = classViewer4.isForegroundSet();
        classViewer0.setContentPane((java.awt.Container) classViewer4);
        classViewer4.repaint(4, 10, (int) (byte) 100, (int) (byte) 10);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener16 = null;
        classViewer4.addHierarchyBoundsListener(hierarchyBoundsListener16);
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        classViewer4.addInputMethodListener(inputMethodListener18);
        java.io.PrintStream printStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            classViewer4.list(printStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        classViewer0.transferFocusBackward();
        com.jstevh.viewer.ClassViewer classViewer5 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        classViewer5.removeMouseWheelListener(mouseWheelListener6);
        int int8 = classViewer5.getHeight();
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.add((java.awt.Component) classViewer5, (java.lang.Object) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: constraint must be a string (or null)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        classViewer8.removeMouseWheelListener(mouseWheelListener9);
        boolean boolean11 = classViewer8.isValidateRoot();
        classViewer8.hide();
        java.awt.Component component13 = classViewer4.add((java.awt.Component) classViewer8);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = classViewer4.createImage(imageProducer14);
        com.jstevh.viewer.ClassViewer classViewer18 = new com.jstevh.viewer.ClassViewer();
        classViewer18.hide();
        java.awt.Dimension dimension20 = classViewer18.getPreferredSize();
        int int21 = classViewer0.checkImage(image15, 4, (int) (short) 10, (java.awt.image.ImageObserver) classViewer18);
        java.awt.Graphics graphics22 = null;
        classViewer18.paint(graphics22);
        com.jstevh.viewer.ClassViewer classViewer24 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener25 = null;
        classViewer24.removeMouseWheelListener(mouseWheelListener25);
        boolean boolean27 = classViewer24.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer28 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener29 = null;
        classViewer28.removeMouseWheelListener(mouseWheelListener29);
        boolean boolean31 = classViewer28.isValidateRoot();
        classViewer28.hide();
        java.awt.Component component33 = classViewer24.add((java.awt.Component) classViewer28);
        classViewer18.remove((java.awt.Component) classViewer28);
        java.awt.Image image35 = null;
        boolean boolean41 = classViewer18.imageUpdate(image35, 0, (int) (byte) 10, (int) '4', 2013, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(component33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        classViewer0.hide();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer0.addMouseWheelListener(mouseWheelListener5);
        java.awt.Font font7 = classViewer0.getFont();
        classViewer0.setFocusTraversalKeysEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(font7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        java.awt.Event event2 = null;
        boolean boolean4 = classViewer0.keyDown(event2, (-1));
        boolean boolean5 = classViewer0.isBackgroundSet();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        classViewer0.addPropertyChangeListener("<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>", propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = classViewer0.callBrowser("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.jstevh.viewer.SAXDirParser sAXDirParser0 = new com.jstevh.viewer.SAXDirParser();
        sAXDirParser0.endDocument();
        sAXDirParser0.unparsedEntityDecl("5.0.5b", "5.0.5b", "<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>", "5.0.5b");
        char[] charArray8 = new char[] { '4' };
        sAXDirParser0.ignorableWhitespace(charArray8, 10, (int) '4');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        java.awt.Event event2 = null;
        boolean boolean4 = classViewer0.keyDown(event2, (-1));
        boolean boolean5 = classViewer0.isBackgroundSet();
        int int6 = classViewer0.getWidth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.Dimension dimension1 = classViewer0.size();
        java.awt.AWTEvent aWTEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classViewer0.dispatchEvent(aWTEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.Dimension dimension1 = classViewer0.size();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        classViewer0.addPropertyChangeListener("hi!", propertyChangeListener3);
        java.awt.Event event5 = null;
        com.jstevh.viewer.ClassViewer classViewer6 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        classViewer6.removeMouseWheelListener(mouseWheelListener7);
        int int9 = classViewer6.getHeight();
        boolean boolean10 = classViewer6.isMaximumSizeSet();
        classViewer6.transferFocus();
        java.awt.Graphics graphics12 = null;
        classViewer6.printComponents(graphics12);
        java.awt.event.ContainerListener[] containerListenerArray14 = classViewer6.getContainerListeners();
        boolean boolean15 = classViewer0.lostFocus(event5, (java.lang.Object) classViewer6);
        classViewer0.setLocation(100, 4);
        java.awt.Event event19 = null;
        boolean boolean21 = classViewer0.keyUp(event19, 32);
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(containerListenerArray14);
        org.junit.Assert.assertArrayEquals(containerListenerArray14, new java.awt.event.ContainerListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        classViewer0.invalidate();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        java.awt.Component component9 = classViewer4.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension10 = classViewer4.getMaximumSize();
        java.awt.Dimension dimension11 = classViewer0.getSize(dimension10);
        classViewer0.transferFocus();
        org.junit.Assert.assertNull(component9);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        classViewer0.hide();
        java.awt.Component component3 = classViewer0.getComponent(0);
        java.awt.Point point4 = classViewer0.location();
        classViewer0.doLayout();
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertNotNull(point4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.jstevh.viewer.SAXDirParser sAXDirParser0 = new com.jstevh.viewer.SAXDirParser();
        sAXDirParser0.skippedEntity("hi!");
        java.lang.String str3 = sAXDirParser0.webData;
        org.xml.sax.Locator locator4 = null;
        sAXDirParser0.setDocumentLocator(locator4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        classViewer8.removeMouseWheelListener(mouseWheelListener9);
        boolean boolean11 = classViewer8.isValidateRoot();
        classViewer8.hide();
        java.awt.Component component13 = classViewer4.add((java.awt.Component) classViewer8);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = classViewer4.createImage(imageProducer14);
        com.jstevh.viewer.ClassViewer classViewer18 = new com.jstevh.viewer.ClassViewer();
        classViewer18.hide();
        java.awt.Dimension dimension20 = classViewer18.getPreferredSize();
        int int21 = classViewer0.checkImage(image15, 4, (int) (short) 10, (java.awt.image.ImageObserver) classViewer18);
        java.awt.Graphics graphics22 = null;
        classViewer18.paint(graphics22);
        com.jstevh.viewer.ClassViewer classViewer24 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener25 = null;
        classViewer24.removeMouseWheelListener(mouseWheelListener25);
        boolean boolean27 = classViewer24.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer28 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener29 = null;
        classViewer28.removeMouseWheelListener(mouseWheelListener29);
        boolean boolean31 = classViewer28.isValidateRoot();
        classViewer28.hide();
        java.awt.Component component33 = classViewer24.add((java.awt.Component) classViewer28);
        classViewer18.remove((java.awt.Component) classViewer28);
        java.awt.event.FocusListener focusListener35 = null;
        classViewer18.removeFocusListener(focusListener35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(component33);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        classViewer0.invalidate();
        java.awt.Component component6 = classViewer0.findComponentAt(10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Cursor cursor7 = component6.getCursor();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(component6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        boolean boolean1 = classViewer0.isValid();
        java.awt.Event event2 = null;
        boolean boolean4 = classViewer0.keyDown(event2, (-1));
        boolean boolean5 = classViewer0.isBackgroundSet();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        classViewer0.addPropertyChangeListener("<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>", propertyChangeListener7);
        classViewer0.destroy();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.jstevh.viewer.SAXDirParser sAXDirParser0 = new com.jstevh.viewer.SAXDirParser();
        sAXDirParser0.skippedEntity("hi!");
        org.xml.sax.Attributes attributes6 = null;
        sAXDirParser0.startElement("+", "panel0", "hi!", attributes6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.dnd.DropTarget dropTarget3 = null;
        classViewer0.setDropTarget(dropTarget3);
        java.lang.Object obj5 = classViewer0.getTreeLock();
        java.awt.Point point7 = classViewer0.getMousePosition(false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(point7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        classViewer8.removeMouseWheelListener(mouseWheelListener9);
        boolean boolean11 = classViewer8.isValidateRoot();
        classViewer8.hide();
        java.awt.Component component13 = classViewer4.add((java.awt.Component) classViewer8);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = classViewer4.createImage(imageProducer14);
        com.jstevh.viewer.ClassViewer classViewer18 = new com.jstevh.viewer.ClassViewer();
        classViewer18.hide();
        java.awt.Dimension dimension20 = classViewer18.getPreferredSize();
        int int21 = classViewer0.checkImage(image15, 4, (int) (short) 10, (java.awt.image.ImageObserver) classViewer18);
        java.awt.Graphics graphics22 = null;
        classViewer18.printAll(graphics22);
        classViewer18.firePropertyChange("<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>", 1.0f, (float) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.applet.AppletContext appletContext28 = classViewer18.getAppletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        classViewer0.firePropertyChange("+", (long) '4', (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        classViewer0.invalidate();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        java.awt.Component component9 = classViewer4.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension10 = classViewer4.getMaximumSize();
        java.awt.Dimension dimension11 = classViewer0.getSize(dimension10);
        com.jstevh.viewer.ClassViewer classViewer12 = new com.jstevh.viewer.ClassViewer();
        boolean boolean13 = classViewer12.isValid();
        java.awt.Event event14 = null;
        boolean boolean16 = classViewer12.keyDown(event14, (-1));
        boolean boolean17 = classViewer12.isBackgroundSet();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        classViewer12.addPropertyChangeListener("<?xml version='1.0' encoding='ISO-8859-1' standalone='yes'?><Base><Documentation><Group><Description>Java SDK 7.0</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/7/docs/api/</Web><Local></Local></Location><Names><pkg>java.lang.</pkg><pkg>java.io.</pkg><pkg>java.lang.reflect.</pkg><pkg>java.util.</pkg><pkg>java.awt.event.</pkg><pkg>java.awt.datatransfer.</pkg><pkg>java.awt.</pkg><pkg>java.net.</pkg><pkg>java.applet.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group><Group><Description>Java Enterprise</Description><Owner>Oracle</Owner><Location><Web>http://docs.oracle.com/javase/6/docs/api/</Web></Location><Names><pkg>javax.swing.border.</pkg><pkg></pkg><pkg></pkg><pkg></pkg><pkg></pkg></Names></Group></Documentation></Base>", propertyChangeListener19);
        classViewer0.remove((java.awt.Component) classViewer12);
        org.junit.Assert.assertNull(component9);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        classViewer0.addPropertyChangeListener("", propertyChangeListener5);
        java.awt.Component[] componentArray7 = classViewer0.getComponents();
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray8 = classViewer0.getMouseWheelListeners();
        java.lang.String str9 = classViewer0.getAppletInfo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray8);
        org.junit.Assert.assertArrayEquals(mouseWheelListenerArray8, new java.awt.event.MouseWheelListener[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassViewer for Java\nAuthor: James Harris\nVersion: 5.0.5b" + "'", str9, "ClassViewer for Java\nAuthor: James Harris\nVersion: 5.0.5b");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = classViewer0.createImage(imageProducer10);
        java.awt.Rectangle rectangle12 = classViewer0.getBounds();
        java.awt.Component component15 = classViewer0.getComponentAt((int) (byte) 10, 32);
        java.awt.Insets insets16 = classViewer0.getInsets();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNotNull(rectangle12);
        org.junit.Assert.assertNull(component15);
        org.junit.Assert.assertNotNull(insets16);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = classViewer0.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        classViewer4.hide();
        java.awt.Component component9 = classViewer0.add((java.awt.Component) classViewer4);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = classViewer0.createImage(imageProducer10);
        java.awt.Rectangle rectangle12 = classViewer0.getBounds();
        classViewer0.destroy();
        classViewer0.setVisible(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNotNull(rectangle12);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.jstevh.viewer.SAXDirParser sAXDirParser0 = new com.jstevh.viewer.SAXDirParser();
        sAXDirParser0.unparsedEntityDecl("hi!", "ClassViewer for Java\nAuthor: James Harris\nVersion: 5.0.5b", "+", "hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        classViewer8.removeMouseWheelListener(mouseWheelListener9);
        boolean boolean11 = classViewer8.isValidateRoot();
        classViewer8.hide();
        java.awt.Component component13 = classViewer4.add((java.awt.Component) classViewer8);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = classViewer4.createImage(imageProducer14);
        com.jstevh.viewer.ClassViewer classViewer18 = new com.jstevh.viewer.ClassViewer();
        classViewer18.hide();
        java.awt.Dimension dimension20 = classViewer18.getPreferredSize();
        int int21 = classViewer0.checkImage(image15, 4, (int) (short) 10, (java.awt.image.ImageObserver) classViewer18);
        java.awt.Graphics graphics22 = null;
        classViewer18.paint(graphics22);
        int int24 = classViewer18.getComponentCount();
        classViewer18.resize((int) (short) 1, (int) (short) 10);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener28 = null;
        classViewer18.removeHierarchyBoundsListener(hierarchyBoundsListener28);
        java.awt.Event event30 = null;
        boolean boolean33 = classViewer18.mouseEnter(event30, 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        boolean boolean5 = classViewer4.isValid();
        java.awt.Event event6 = null;
        boolean boolean8 = classViewer4.keyDown(event6, (-1));
        boolean boolean9 = classViewer4.isForegroundSet();
        classViewer0.setContentPane((java.awt.Container) classViewer4);
        classViewer4.repaint(4, 10, (int) (byte) 100, (int) (byte) 10);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener16 = null;
        classViewer4.addHierarchyBoundsListener(hierarchyBoundsListener16);
        com.jstevh.viewer.ClassViewer classViewer18 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener19 = null;
        classViewer18.removeMouseWheelListener(mouseWheelListener19);
        boolean boolean21 = classViewer18.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer22 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener23 = null;
        classViewer22.removeMouseWheelListener(mouseWheelListener23);
        boolean boolean25 = classViewer22.isValidateRoot();
        classViewer22.hide();
        java.awt.Component component27 = classViewer18.add((java.awt.Component) classViewer22);
        java.awt.image.ImageProducer imageProducer28 = null;
        java.awt.Image image29 = classViewer18.createImage(imageProducer28);
        java.awt.Rectangle rectangle30 = classViewer18.getBounds();
        classViewer4.setBounds(rectangle30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(component27);
        org.junit.Assert.assertNotNull(image29);
        org.junit.Assert.assertNotNull(rectangle30);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        java.awt.Component component5 = classViewer0.locate((int) (byte) 10, (int) (byte) 10);
        java.awt.Dimension dimension6 = classViewer0.getMaximumSize();
        java.awt.Event event7 = null;
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        classViewer8.hide();
        java.awt.Dimension dimension10 = classViewer8.getPreferredSize();
        boolean boolean11 = classViewer0.gotFocus(event7, (java.lang.Object) classViewer8);
        classViewer8.start();
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.jstevh.viewer.ClassViewer classViewer0 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        classViewer0.removeMouseWheelListener(mouseWheelListener1);
        int int3 = classViewer0.getHeight();
        com.jstevh.viewer.ClassViewer classViewer4 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        classViewer4.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = classViewer4.isValidateRoot();
        com.jstevh.viewer.ClassViewer classViewer8 = new com.jstevh.viewer.ClassViewer();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        classViewer8.removeMouseWheelListener(mouseWheelListener9);
        boolean boolean11 = classViewer8.isValidateRoot();
        classViewer8.hide();
        java.awt.Component component13 = classViewer4.add((java.awt.Component) classViewer8);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = classViewer4.createImage(imageProducer14);
        com.jstevh.viewer.ClassViewer classViewer18 = new com.jstevh.viewer.ClassViewer();
        classViewer18.hide();
        java.awt.Dimension dimension20 = classViewer18.getPreferredSize();
        int int21 = classViewer0.checkImage(image15, 4, (int) (short) 10, (java.awt.image.ImageObserver) classViewer18);
        java.awt.event.MouseListener mouseListener22 = null;
        classViewer18.addMouseListener(mouseListener22);
        classViewer18.stop();
        java.awt.ComponentOrientation componentOrientation25 = classViewer18.getComponentOrientation();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(componentOrientation25);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = com.jstevh.viewer.ClassInfo.getData(classArray0);
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertArrayEquals(classArray0, new java.lang.Class[] {});
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String str0 = com.jstevh.viewer.ClassViewer.classPath;
        org.junit.Assert.assertNull(str0);
    }
}

