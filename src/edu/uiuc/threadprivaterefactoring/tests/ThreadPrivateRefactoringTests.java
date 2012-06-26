package edu.uiuc.threadprivaterefactoring.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import edu.uiuc.threadprivaterefactoring.ThreadPrivateRefactoring;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.corext.refactoring.Checks;
import org.eclipse.jdt.ui.tests.refactoring.infra.AbstractSelectionTestCase;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

public class ThreadPrivateRefactoringTests extends AbstractSelectionTestCase {

	private static ThreadPrivateRefactoringTestSetup fgTestSetup;

	public ThreadPrivateRefactoringTests(String name) {
		super(name);
	}

	public static Test suite() {
		fgTestSetup = new ThreadPrivateRefactoringTestSetup(new TestSuite(
				ThreadPrivateRefactoringTests.class));
		return fgTestSetup;
	}

	public static Test setUpTest(Test test) {
		fgTestSetup = new ThreadPrivateRefactoringTestSetup(test);
		return fgTestSetup;
	}

	protected void setUp() throws Exception {
		super.setUp();
		fIsPreDeltaTest = true;
	}

	protected String getResourceLocation() {
		return "ThreadPrivateRefactoring/";
	}

	protected String adaptName(String name) {
		return Character.toUpperCase(name.charAt(0)) + name.substring(1)
				+ ".java";
	}

	protected void performTest(IPackageFragment packageFragment, String id,
			String outputFolder, String fieldName) throws Exception {
		ICompilationUnit unit = createCU(packageFragment, id);
		IField field = getField(unit, fieldName);
		assertNotNull(field);

		initializePreferences();

		ThreadPrivateRefactoring refactoring = new ThreadPrivateRefactoring(field);
		performTest(unit, refactoring, COMPARE_WITH_OUTPUT,
				getProofedContent(outputFolder, id), true);
	}

	protected void performInvalidTest(IPackageFragment packageFragment,
			String id, String fieldName) throws Exception {
		ICompilationUnit unit = createCU(packageFragment, id);
		IField field = getField(unit, fieldName);
		assertNotNull(field);

		initializePreferences();

		ThreadPrivateRefactoring refactoring = new ThreadPrivateRefactoring(field);
		if (refactoring != null) {
			RefactoringStatus status = refactoring
					.checkAllConditions(new NullProgressMonitor());
			assertTrue(status.hasError());
			assertEquals(1, status.getEntries().length);
		}
	}

	private void initializePreferences() {
		Preferences preferences = JavaCore.getPlugin().getPluginPreferences();
		preferences.setValue(JavaCore.CODEASSIST_FIELD_PREFIXES, "");
		preferences.setValue(JavaCore.CODEASSIST_STATIC_FIELD_PREFIXES, "");
		preferences.setValue(JavaCore.CODEASSIST_FIELD_SUFFIXES, "");
		preferences.setValue(JavaCore.CODEASSIST_STATIC_FIELD_SUFFIXES, "");
	}

	private static IField getField(ICompilationUnit unit, String fieldName)
			throws Exception {
		IField result = null;
		IType[] types = unit.getAllTypes();
		for (int i = 0; i < types.length; i++) {
			IType type = types[i];
			result = type.getField(fieldName);
			if (result != null && result.exists())
				break;
		}
		return result;
	}

	private void objectTest(String fieldName) throws Exception {
		performTest(fgTestSetup.getObjectPackage(), getName(), "object_out",
				fieldName);
	}

	private void baseTest(String fieldName) throws Exception {
		performTest(fgTestSetup.getBasePackage(), getName(), "base_out",
				fieldName);
	}

	private void invalidTest(String fieldName) throws Exception {
		performInvalidTest(fgTestSetup.getInvalidPackage(), getName(),
				fieldName);
	}

	private void existingTest(String fieldName) throws Exception {
		performTest(fgTestSetup.getExistingMethodPackage(), getName(),
				"existingmethods_out", fieldName);
	}

	// =====================================================================================
	// Basic Object Test
	// =====================================================================================

	public void testSetAndGet() throws Exception {
		objectTest("f");
	}

	public void testFindThisReferences() throws Exception {
		objectTest("f");
	}

	public void testNestedFieldAccess() throws Exception {
		objectTest("f");
	}

	public void testInitAtDeclaration() throws Exception{
		objectTest("f");
	}

	public void testInitInConstructorWithParam() throws Exception {
		objectTest("f");
	}
	
	public void testInitInConstructorWithoutParam() throws Exception {
		objectTest("f");
	}
	
	public void testFieldPassedAsParameter() throws Exception {
		objectTest("f");
	}
	
	public void testOperatorDecrementPrefix() throws Exception {
		objectTest("f");
	}

	public void testOperatorDecrementPostfix() throws Exception {
		objectTest("f");
	}
	
	public void testOperatorIncrementPrefix() throws Exception{
		objectTest("f");
	}
	
	public void testOperatorIncrementPostfix() throws Exception{
		objectTest("f");
	}
	
	public void testOperatorPlusAssign() throws Exception{
		objectTest("f");
	}
	
	public void testOperatorMinusAssign() throws Exception{
		objectTest("f");
	}
	
	public void testOperatorDivideAssign() throws Exception{
		objectTest("f");
	}
	
	public void testOperatorMultiplyAssign() throws Exception{
		objectTest("f");
	}
	
	public void testOperatorBitAndAssign() throws Exception{
		objectTest("f");
	}
	
	public void testOperatorBitOrAssign() throws Exception{
		objectTest("f");
	}
	
	public void testOperatorBitXorAssign() throws Exception{
		objectTest("f");
	}
	
	public void testOperatorRemainderAssign() throws Exception{
		objectTest("f");
	}
	
	public void testOperatorLeftShiftAssign() throws Exception{
		objectTest("f");
	}
	
	public void testOperatorRightUnsignedShiftAssign() throws Exception{
		objectTest("f");
	}
	
	public void testOperatorRightSignedShiftAssign() throws Exception{
		objectTest("f");
	}
	
	public void testSimpleRefactoring() throws Exception {
		objectTest("shared");
	}
	
	public void testAccessInAnonymous() throws Exception {
		objectTest("f");
	}
}
