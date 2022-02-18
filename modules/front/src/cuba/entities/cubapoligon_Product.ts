import { StandardEntity } from "./base/sys$StandardEntity";
export class Product extends StandardEntity {
  static NAME = "cubapoligon_Product";
  name?: string | null;
  price?: any | null;
}
export type ProductViewName = "_base" | "_local" | "_minimal";
export type ProductView<V extends ProductViewName> = V extends "_base"
  ? Pick<Product, "id" | "name" | "price">
  : V extends "_local"
  ? Pick<Product, "id" | "name" | "price">
  : V extends "_minimal"
  ? Pick<Product, "id" | "name">
  : never;
