/*
 * Copyright 2013-2016 Sergey Ignatov, Alexander Zolotov, Florin Patan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This is a generated file. Not intended for manual editing.
package com.goide.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.goide.GoTypes.*;
import com.goide.stubs.GoMethodSpecStub;
import com.goide.psi.*;
import com.intellij.psi.ResolveState;
import com.intellij.psi.stubs.IStubElementType;

public class GoMethodSpecImpl extends GoNamedElementImpl<GoMethodSpecStub> implements GoMethodSpec {

  public GoMethodSpecImpl(ASTNode node) {
    super(node);
  }

  public GoMethodSpecImpl(GoMethodSpecStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull GoVisitor visitor) {
    visitor.visitMethodSpec(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoVisitor) accept((GoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GoSignature getSignature() {
    return findChildByClass(GoSignature.class, com.goide.stubs.GoSignatureStub.class);
  }

  @Override
  @Nullable
  public GoTypeReferenceExpression getTypeReferenceExpression() {
    return findChildByClass(GoTypeReferenceExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Nullable
  public GoType getGoTypeInner(ResolveState context) {
    return GoPsiImplUtil.getGoTypeInner(this, context);
  }

  @Nullable
  public String getName() {
    return GoPsiImplUtil.getName(this);
  }

}
